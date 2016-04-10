package com.my.context;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Denys Murzin
 */
public class ContextHolderImpl implements ContextHolder {

    private Map<ContextStepKey, Context> param = new HashMap<>();

    private ContextStepKey currentStep;

    @Override
    public void put(ContextStepKey key, Context context) {
        this.param.put(key, context);
        this.currentStep = key;
    }

    @Override
    public Context get(ContextStepKey key) {
        return param.get(key);
    }

    @Override
    public ContextStepKey getCurrentStepKey() {
        return currentStep;
    }

}
