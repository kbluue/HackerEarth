package com.company.HackerEarth.JuneCircuit19;

public class Path {

    int value, outlets;
    boolean open;
    Direction dir;

    public Path(int value, int outlets, boolean open, Direction dir) {
        this.value = value;
        this.outlets = outlets;
        this.open = open;
        this.dir = dir;
    }

    public boolean fitsCase1(){
        return (!open && outlets == 1);
    }
}
