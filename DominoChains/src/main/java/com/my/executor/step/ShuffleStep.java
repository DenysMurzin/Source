package com.my.executor.step;

import com.my.context.Context;
import com.my.context.ContextHolder;
import com.my.context.ContextImpl;
import com.my.model.Tile;
import com.my.shuffler.Shuffler;
import com.my.shuffler.ShufflerFactory;

import java.util.List;

import static com.my.context.ContextStepKey.GET_TILE_STEP;
import static com.my.context.ContextStepKey.SHUFFLE_STEP;

/**
 * @author Denys Murzin
 */
public class ShuffleStep implements Step {
    @Override
    public void perform(ContextHolder holder) {
        Context<List<Tile>> context = holder.get(GET_TILE_STEP);

        List<Tile> tileSet = context.get();

        Shuffler shuffler = ShufflerFactory.createShuffler();

        tileSet = shuffler.shuffle(tileSet);

        holder.put(SHUFFLE_STEP, new ContextImpl<>(tileSet));
    }
}
