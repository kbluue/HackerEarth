package com.company.HackerEarth.JuneCircuit19;

import java.io.InvalidObjectException;

public class Path implements Comparable {

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

    @Override
    public int compareTo(Object o) {
        if (o instanceof Path){
            return value - ((Path)o).value;
        }
        return 0;
    }
}
