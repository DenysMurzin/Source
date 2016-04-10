package com.my.executor.step;

import com.my.context.Context;
import com.my.context.ContextHolder;
import com.my.context.ContextImpl;
import com.my.model.Tile;
import com.my.selector.Selector;
import com.my.selector.SelectorFactory;

import java.util.List;

import static com.my.context.ContextStepKey.INPUT_NUMBER_STEP;
import static com.my.context.ContextStepKey.SELECT_STEP;
import static com.my.context.ContextStepKey.SHUFFLE_STEP;

/**
 * @author Denys Murzin
 */
public class SelectStep implements Step {
    @Override
    public void perform(ContextHolder holder) {
        Context<Integer> inputNumberContext = holder.get(INPUT_NUMBER_STEP);
        Integer inputNumber = inputNumberContext.get();

        Context<List<Tile>> shuffledSetContext = holder.get(SHUFFLE_STEP);
        List<Tile> shuffledSet = shuffledSetContext.get();

        Selector selector = SelectorFactory.getSelector();
        List<Tile> selectedSet = selector.select(inputNumber, shuffledSet);

        holder.put(SELECT_STEP, new ContextImpl<>(selectedSet));
    }
}
