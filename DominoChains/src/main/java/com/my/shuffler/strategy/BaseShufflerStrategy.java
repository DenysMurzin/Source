package com.my.shuffler.strategy;

import com.my.model.Tile;

import java.util.Collections;
import java.util.List;

/**
 * @author Denys Murzin
 */
public class BaseShufflerStrategy implements ShuffleStrategy {

    @Override
    public List<Tile> shuffle(List<Tile> tileSet) {
        Collections.shuffle(tileSet);
        return tileSet;
    }
}
