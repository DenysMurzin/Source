package com.my.executor;


import com.my.context.ContextHolder;
import com.my.context.ContextHolderImpl;
import com.my.executor.step.Step;

import java.util.List;

/**
 * @author Denys Murzin
 */
public class BaseExecutor implements Executor {

    public void execute() {
        StepSetProvider provider = new StepSetProvider();
        List<Step> steps = provider.provideExecutorOrder();

        ContextHolder holder = new ContextHolderImpl();

        for (Step step : steps) {
            step.perform(holder);
        }
    }
}
