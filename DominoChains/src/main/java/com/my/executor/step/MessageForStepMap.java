package com.my.executor.step;

import com.my.context.ContextStepKey;

import java.util.HashMap;
import java.util.Map;

import static com.my.context.ContextStepKey.INPUT_NUMBER_STEP;
import static com.my.context.ContextStepKey.SELECT_STEP;
import static com.my.context.ContextStepKey.SOLVER_STEP;

/**
 * @author Denys Murzin
 */
public class MessageForStepMap {

    private static Map<ContextStepKey, String> map = new HashMap<>();

    static {
        map.put(INPUT_NUMBER_STEP, "Please, input number of tiles:");
        map.put(SELECT_STEP, "Selected Tiles:");
        map.put(SOLVER_STEP, "The longest chain:");
    }

    public static String getMessageForStep(ContextStepKey key) {
        return map.get(key);
    }
}
