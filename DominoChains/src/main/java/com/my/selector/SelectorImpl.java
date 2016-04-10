package com.my.selector;

import com.my.model.Tile;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Denys Murzin
 */
public class SelectorImpl implements Selector {

    @Override
    public List<Tile> select(int inputNumber, List<Tile> tileSet) {
        List<Tile> selectedTiles = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < inputNumber; i++) {
            int indexItemToAdd = rand.nextInt(tileSet.size());
            if (indexItemToAdd >= 0) {
                selectedTiles.add(tileSet.remove(indexItemToAdd));
            }
        }
        return selectedTiles;
    }
}
