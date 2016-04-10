package com.my.util;


import com.my.model.Tile;

import java.util.LinkedList;
import java.util.List;
/**
 * @author Denys Murzin
 */
public class TileChain {

    LinkedList<Tile> chain = new LinkedList<>();

    public TileChain attach(Tile tile) {

        TileChain result = getCopy();

        if (result.isEmpty()) {
            result.add(tile);
            return result;
        }
        if (result.getLast().getSideB() == tile.getSideA()) {
            result.addLast(tile);
            return result;
        }
        if (result.getLast().getSideB() == tile.getSideB()) {
            tile.turn();
            result.addLast(tile);
            return result;
        }
        if (result.getFirst().getSideA() == tile.getSideB()) {
            result.addFirst(tile);
            return result;
        }
        if (result.getFirst().getSideA() == tile.getSideA()) {
            tile.turn();
            result.addFirst(tile);
            return result;
        }
        return result;
    }

    public TileChain detach(Tile tile) {
        TileChain result = getCopy();
        if (result.getFirst().equals(tile)) {
            result.removeFirst();
            return result;
        }
        if (result.getLast().equals(tile)) {
            result.removeLast();
            return result;
        }
        return result;
    }

    public void add(Tile tile) {
        chain.add(tile);
    }

    public Tile get(int index) {
        return chain.get(index);
    }

    public void addLast(Tile tile) {
        chain.addLast(tile);
    }

    public Tile getLast() {
        return chain.getLast();
    }

    public void addFirst(Tile tile) {
        chain.addFirst(tile);
    }

    public Tile getFirst() {
        return chain.getFirst();
    }

    public void removeFirst() {
        chain.removeFirst();
    }

    public void removeLast() {
        chain.removeLast();
    }

    public boolean isPossibleToAdd(Tile tile) {
        if (chain.isEmpty()) {
            return true;
        }
        if (tile.isContain(getFirst().getSideA())) {
            return true;
        }
        if (tile.isContain(getLast().getSideB())) {
            return true;
        }
        return false;
    }

    public int size() {
        return chain.size();
    }

    public boolean isEmpty() {
        return chain.isEmpty();
    }

    public List<Tile> getList() {
        return chain;
    }

    public TileChain getCopy() {
        TileChain copy = new TileChain();
        for (Tile tile : chain) {
            copy.add(new Tile(tile.getSideA(),tile.getSideB()));
        }
        return copy;
    }
}
