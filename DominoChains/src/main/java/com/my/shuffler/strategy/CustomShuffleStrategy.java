package com.my.shuffler.strategy;

import com.my.model.Tile;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Denys Murzin
 */
public class CustomShuffleStrategy implements ShuffleStrategy {
    @Override
    public List<Tile> shuffle(List<Tile> tileSet) {
        int sortedSetSize = tileSet.size();

        List<Tile> shuffledSet = new ArrayList<Tile>();
        while (shuffledSet.size() != sortedSetSize) {
            int rand = (int) (Math.random() * (sortedSetSize));
            if (!shuffledSet.contains(tileSet.get(rand)))
                shuffledSet.add(tileSet.get(rand));
        }
        return shuffledSet;
    }
}
