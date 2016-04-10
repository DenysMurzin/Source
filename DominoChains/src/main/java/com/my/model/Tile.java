package com.my.model;

/**
 * @author Denys Murzin
 */
public class Tile {

    int sideA;

    int sideB;

    public Tile(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public boolean isContain(int value) {
        return sideA == value || sideB == value;
    }

    public void turn() {
        int tmp;
        tmp = sideA;
        sideA = sideB;
        sideB = tmp;
    }

    @Override
    public String toString() {
        return String.format("[%s|%s]", sideA, sideB);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tile tile = (Tile) o;

        if (sideA == tile.sideA && sideB == tile.sideB) {
            return true;
        }
        if (sideA == tile.sideB && sideB == tile.sideA) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = sideA;
        result = 31 * result + sideB;
        return result;
    }
}
