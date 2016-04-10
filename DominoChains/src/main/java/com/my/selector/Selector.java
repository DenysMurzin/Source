package com.my.selector;

import com.my.model.Tile;

import java.util.List;

/**
 * @author Denys Murzin
 */
public interface Selector {

    List<Tile> select(int inputNumber, List<Tile> tileSet);

}
