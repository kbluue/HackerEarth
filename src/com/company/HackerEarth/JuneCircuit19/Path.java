package com.company.HackerEarth.JuneCircuit19;

public class Path implements Comparable {

    private int value, outlets;
    public boolean open, fitsCase2;
    Direction dir;

    Path(int value, int outlets, boolean open, boolean fitsCase2, Direction dir) {
        this.value = value;
        this.outlets = outlets;
        this.open = open;
        this.fitsCase2 = fitsCase2;
        this.dir = dir;
    }

    boolean fitsCase1(){
        return (!open && outlets == 1);
    }

    @Override
    public int compareTo(Object o) {
        return value - ((Path)o).value;
    }
}
