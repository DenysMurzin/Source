package com.my.shuffler;

import com.my.model.Tile;
import com.my.shuffler.strategy.ShuffleStrategy;

import java.util.List;

/**
 * @author Denys Murzin
 */
public class ShufflerImpl implements Shuffler {

    private ShuffleStrategy strategy;

    public ShufflerImpl(ShuffleStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public List<Tile> shuffle(List<Tile> tileSet) {
        return strategy.shuffle(tileSet);
    }
}
