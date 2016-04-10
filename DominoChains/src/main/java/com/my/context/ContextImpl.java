package com.my.context;

/**
 * @author Denys Murzin
 */
public class ContextImpl<T> implements Context {

    T value;

    public ContextImpl(T value) {

        this.value = value;
    }

    @Override
    public T get() {
        return value;
    }
}
