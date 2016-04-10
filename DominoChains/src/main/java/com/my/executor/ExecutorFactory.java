package com.my.executor;

/**
 * @author Denys Murzin
 */
public class ExecutorFactory {
    public static Executor getExecutor() {
        return new BaseExecutor();
    }
}
