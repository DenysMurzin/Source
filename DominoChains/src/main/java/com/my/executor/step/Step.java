package com.my.executor.step;

import com.my.context.ContextHolder;

/**
 * @author Denys Murzin
 */
public interface Step {

    public void perform(ContextHolder holder);

}
