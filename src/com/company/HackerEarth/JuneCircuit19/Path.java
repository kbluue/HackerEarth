package com.company.HackerEarth.JuneCircuit19;

import java.io.InvalidObjectException;
import java.util.Arrays;
import java.util.Comparator;

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
        System.out.println(dir + " ==> " + open + "//" + outlets);
        return (!open && outlets == 1);
    }

    @Override
    public int compareTo(Object o) {
        return value - ((Path)o).value;
    }
}
