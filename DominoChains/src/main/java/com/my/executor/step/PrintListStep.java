package com.my.executor.step;

import com.my.context.Context;
import com.my.context.ContextHolder;
import com.my.context.ContextStepKey;
import com.my.model.Tile;

import java.util.List;

import static com.my.executor.step.MessageForStepMap.getMessageForStep;

/**
 * @author Denys Murzin
 */
public class PrintListStep implements Step {
    @Override
    public void perform(ContextHolder holder) {
        ContextStepKey key = holder.getCurrentStepKey();

        Context<List<Tile>> contextForPrint = holder.get(key);
        List<Tile> listForPrint = contextForPrint.get();

        String stepMessage = getMessageForStep(key);

        if (null != stepMessage) {
            System.out.println(stepMessage);
        }

        for (Tile tile : listForPrint) {
            System.out.print(tile);
        }
        System.out.println();
    }
}
