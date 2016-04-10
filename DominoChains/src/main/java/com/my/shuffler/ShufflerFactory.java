package com.my.shuffler;

import com.my.shuffler.strategy.CustomShuffleStrategy;

/**
 * @author Denys Murzin
 */
public class ShufflerFactory {

    public static Shuffler createShuffler() {
        return new ShufflerImpl(new CustomShuffleStrategy());
    }

}
