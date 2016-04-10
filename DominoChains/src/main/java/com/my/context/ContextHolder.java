package com.my.context;

/**
 * @author Denys Murzin
 */
public interface ContextHolder {

    void put(ContextStepKey key, Context context);

    Context get(ContextStepKey key);

    ContextStepKey getCurrentStepKey();
}
