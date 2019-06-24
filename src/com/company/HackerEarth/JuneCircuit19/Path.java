package com.company.HackerEarth.JuneCircuit19;

public class Path {

    int value;
    boolean open;
    Direction dir;

    public Path(int value, boolean open, Direction dir) {
        this.value = value;
        this.open = open;
        this.dir = dir;
    }
}
