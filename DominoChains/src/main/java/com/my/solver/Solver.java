package com.my.solver;

import com.my.model.Tile;

import java.util.List;

/**
 * @author Denys Murzin
 */
public interface Solver {

    List<Tile> determineLongestChain(List<Tile> selectedTileSet);

}
