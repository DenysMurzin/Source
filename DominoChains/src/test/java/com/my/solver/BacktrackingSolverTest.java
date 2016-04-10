package com.my.solver;

import com.my.model.Tile;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Denys Murzin
 */
public class BacktrackingSolverTest {

    Solver solver = SolverFactory.getSolver();

    @Test
    public void testEmptyTileSet(){
        List<Tile> tileSet = new ArrayList<>();
        List<Tile> longestChain = solver.determineLongestChain(tileSet);

        int expectedLength = 0;
        assertEquals("Empty chain",expectedLength, longestChain.size());
    }

    @Test
    public void testOneElementInChain() {
        List<Tile> tileSet = new ArrayList<>();
        tileSet.add(new Tile(0,0));
        tileSet.add(new Tile(1,1));
        tileSet.add(new Tile(2,2));
        tileSet.add(new Tile(3,3));
        tileSet.add(new Tile(4,4));
        tileSet.add(new Tile(5,5));
        tileSet.add(new Tile(6,6));

        List<Tile> longestChain = solver.determineLongestChain(tileSet);
        int expectedLength = 1;
        assertEquals("One element in chain",expectedLength, longestChain.size());
    }
    @Test
    public void testTwoElementsInChain(){
        List<Tile> tileSet = new ArrayList<>();
        tileSet.add(new Tile(0,0));
        tileSet.add(new Tile(0,1));
        tileSet.add(new Tile(2,2));
        tileSet.add(new Tile(3,3));
        tileSet.add(new Tile(4,4));
        tileSet.add(new Tile(5,5));
        tileSet.add(new Tile(6,6));

        List<Tile> longestChain = solver.determineLongestChain(tileSet);
        int expectedLength = 2;
        assertEquals("Two elements in chain",expectedLength, longestChain.size());
    }
    @Test
    public void testThreeElementsInChain(){
        List<Tile> tileSet = new ArrayList<>();
        tileSet.add(new Tile(0,0));
        tileSet.add(new Tile(0,1));
        tileSet.add(new Tile(1,2));
        tileSet.add(new Tile(3,3));
        tileSet.add(new Tile(4,4));
        tileSet.add(new Tile(5,5));
        tileSet.add(new Tile(6,6));

        List<Tile> longestChain = solver.determineLongestChain(tileSet);
        int expectedLength = 3;
        assertEquals("Three elements in chain",expectedLength, longestChain.size());
    }
    @Test
    public void testAllElementsInChain(){
        List<Tile> tileSet = new ArrayList<>();
        tileSet.add(new Tile(0,0));
        tileSet.add(new Tile(0,1));
        tileSet.add(new Tile(1,2));
        tileSet.add(new Tile(2,3));
        tileSet.add(new Tile(3,4));
        tileSet.add(new Tile(4,5));
        tileSet.add(new Tile(5,6));

        List<Tile> longestChain = solver.determineLongestChain(tileSet);
        int expectedLength = 7;
        assertEquals("All elements in chain",expectedLength, longestChain.size());
    }
}
