package com.my;

import com.my.executor.Executor;
import com.my.executor.ExecutorFactory;

/**
 * @author Denys Murzin
 */
public class Main {

    public static void main(String[] args) {

        Executor executor = ExecutorFactory.getExecutor();

        executor.execute();
    }
}
