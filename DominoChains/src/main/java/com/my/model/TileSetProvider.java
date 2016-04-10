package com.my.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Denys Murzin
 */
public class TileSetProvider {

    public static int MAX_VALUE = 6;

    public static List<Tile> getSet() {
        List<Tile> tileSet = new ArrayList<Tile>();
        int k = 0;
        for (int i = 0; i <= MAX_VALUE; i++) {
            for (int j = k; j <= MAX_VALUE; j++) {
                tileSet.add(new Tile(i, j));
            }
            k += 1;
        }
        return tileSet;
    }
}
