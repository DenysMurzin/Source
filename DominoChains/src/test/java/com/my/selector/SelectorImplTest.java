package com.my.selector;

import com.my.model.Tile;
import com.my.model.TileSetProvider;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

/**
 * @author Denys Murzin
 */
public class SelectorImplTest {

    Selector selector = SelectorFactory.getSelector();

    List<Tile> tileSet;

    @Before
    public void initialize() {
        tileSet = TileSetProvider.getSet();
    }

    @Test
    public void testSelectNoneTiles() throws Exception {
        int inputNumber = 0;
        List<Tile> selectedSet = selector.select(inputNumber, tileSet);
        int expectedLength = 0;
         assertEquals("Select none tiles", expectedLength, selectedSet.size());
    }

    @Test
    public void testSelectSevenTiles() throws Exception {
        int inputNumber = 7;
        List<Tile> selectedSet = selector.select(inputNumber, tileSet);
        int expectedLength = 7;
         assertEquals("Select seven tiles", expectedLength, selectedSet.size());
    }

    @Test
    public void selectAllTiles(){
        int inputNumber = 28;
        List<Tile> selectedSet = selector.select(inputNumber, tileSet);
        int expectedLength = 28;
        assertEquals("Select all tiles", expectedLength, selectedSet.size());
    }
}
