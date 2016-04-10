package com.my.util;

import com.my.model.Tile;

import java.util.List;

import static com.my.model.TileSetProvider.MAX_VALUE;
/**
 * @author Denys Murzin
 */
public class TileMatrix {

    private static int SIZE = MAX_VALUE +1;

    Tile[][] tileMatrix;

    public TileMatrix(List<Tile> selectedTileSet) {
        tileMatrix = new Tile[SIZE][SIZE];
        fillMatrix(selectedTileSet);
    }

    private void fillMatrix(List<Tile> selectedTileSet) {
        for (Tile tile : selectedTileSet) {
            put(tile);
        }
    }

    public void put(Tile tile) {
        tileMatrix[tile.getSideA()][tile.getSideB()] = tile;
        tileMatrix[tile.getSideB()][tile.getSideA()] = tile;
    }

    public Tile take(int i, int j) {
        Tile tile = tileMatrix[i][j];
        tileMatrix[i][j] = null;
        tileMatrix[j][i] = null;
        return tile;
    }

    public boolean isExist(int i, int j) {
        return tileMatrix[i][j] != null;
    }
}
