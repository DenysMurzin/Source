package com.my.shuffler;

import com.my.model.Tile;

import java.util.List;

/**
 * @author Denys Murzin
 */
public interface Shuffler {

    List<Tile> shuffle(List<Tile> tileSet);
}
