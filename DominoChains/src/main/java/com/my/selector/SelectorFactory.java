package com.my.selector;

/**
 * @author Denys Murzin
 */
public class SelectorFactory {

    public static Selector getSelector() {
        return new SelectorImpl();
    }
}
