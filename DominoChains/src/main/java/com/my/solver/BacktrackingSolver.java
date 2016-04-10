package com.my.solver;

import com.my.model.Tile;
import com.my.util.TileChain;
import com.my.util.TileMatrix;

import java.util.List;

import static com.my.model.TileSetProvider.MAX_VALUE;

/**
 * @author Denys Murzin
 */
public class BacktrackingSolver implements Solver {

    private TileChain longestChain = new TileChain();

    @Override
    public List<Tile> determineLongestChain(List<Tile> selectedTileSet) {
        for (int i = 0; i <= MAX_VALUE; i++) {
            buildChain(i, new TileChain(), new TileMatrix(selectedTileSet));
        }
        return longestChain.getList();
    }

    private TileChain buildChain(int i, TileChain chain, TileMatrix matrix) {
        for (int j = 0; j <= MAX_VALUE; j++) {
            if (matrix.isExist(i, j)) {
                Tile tile = matrix.take(i, j);
                if (chain.isPossibleToAdd(tile)) {
                    chain = chain.attach(tile);
                    setLongestChain(chain);
                    buildChain(j, chain, matrix);
                }
                chain = chain.detach(tile);
                matrix.put(tile);
            }
        }
        return chain;
    }

    private void setLongestChain(TileChain current) {
        if (longestChain.size() < current.size()) {
            longestChain = current.getCopy();
        }
    }
}
