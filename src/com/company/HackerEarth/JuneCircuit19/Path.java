package com.company.HackerEarth.JuneCircuit19;

public class Path implements Comparable {

    private int value, outlets;
    private boolean open, degree3;
    Direction dir;

    Path(int value, int outlets, boolean open, boolean degree3, Direction dir) {
        this.value = value;
        this.outlets = outlets;
        this.open = open;
        this.degree3 = degree3;
        this.dir = dir;
    }

    boolean fitsCase1(){
        return (!open && outlets == 1);
    }

    boolean fitsCase2() {
        return (!open && outlets == 2);
    }

    public boolean isClosed() {
        return !open;
    }

    public boolean isDegree3() {
        return degree3;
    }

    @Override
    public int compareTo(Object o) {
        return value - ((Path)o).value;
    }
}
