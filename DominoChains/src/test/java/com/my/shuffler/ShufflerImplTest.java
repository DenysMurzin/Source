package com.my.shuffler;

import com.my.model.Tile;
import com.my.model.TileSetProvider;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

/**
 * @author Denys Murzin
 */
public class ShufflerImplTest {

    Shuffler shuffler = ShufflerFactory.createShuffler();

    List<Tile> tileSet;

    @Before
    public void initialize() {
        tileSet = TileSetProvider.getSet();
    }

    @Test
    public void testShuffledTileSet() throws Exception {
       List<Tile> shuffledSet =  shuffler.shuffle(tileSet);
       assertFalse("Shuffled tile set",tileSet.equals(shuffledSet));
    }
}
