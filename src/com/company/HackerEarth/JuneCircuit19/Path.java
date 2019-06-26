package com.company.HackerEarth.JuneCircuit19;

public class Path implements Comparable {

    private int value, outlets, degree;
    Direction dir;

    Path(int value, int outlets, int degree, Direction dir) {
        this.value = value;
        this.outlets = outlets;
        this.degree = degree;
        this.dir = dir;
    }

    boolean fitsCase1(){
        return (isClosed() && outlets == 1);
    }

    boolean fitsCase2() {
        return (isClosed() && outlets == 2);
    }

    public boolean isClosed() {
        return degree == 0;
    }

    public boolean isDegree3() {
        return degree == 2;
    }

    @Override
    public int compareTo(Object o) {
        return value - ((Path)o).value;
    }
}
