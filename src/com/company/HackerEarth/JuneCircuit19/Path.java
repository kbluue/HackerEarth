package com.company.HackerEarth.JuneCircuit19;

public class Path implements Comparable {

    private int value, outlets;
    private boolean open;
    Direction dir;

    Path(int value, int outlets, boolean open, Direction dir) {
        this.value = value;
        this.outlets = outlets;
        this.open = open;
        this.dir = dir;
    }

    boolean fitsCase1(){
        return (!open && outlets == 1);
    }

    boolean fitsCase2() {
        return (!open && outlets == 2);
    }

    public boolean isOpen() {
        return open;
    }

    @Override
    public int compareTo(Object o) {
        return value - ((Path)o).value;
    }
}
