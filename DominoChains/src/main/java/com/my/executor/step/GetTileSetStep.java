package com.my.executor.step;

import com.my.context.ContextHolder;
import com.my.context.ContextImpl;
import com.my.model.Tile;
import com.my.model.TileSetProvider;

import java.util.List;

import static com.my.context.ContextStepKey.GET_TILE_STEP;

/**
 * @author Denys Murzin
 */
public class GetTileSetStep implements Step {

    @Override
    public void perform(ContextHolder holder) {
        List<Tile> tileSet = TileSetProvider.getSet();
        holder.put(GET_TILE_STEP, new ContextImpl<>(tileSet));
    }
}
