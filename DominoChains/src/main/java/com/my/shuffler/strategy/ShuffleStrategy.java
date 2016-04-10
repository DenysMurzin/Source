package com.my.shuffler.strategy;

import com.my.model.Tile;

import java.util.List;

/**
 * @author Denys Murzin
 */
public interface ShuffleStrategy {

    List<Tile> shuffle(List<Tile> tileSet);

}
