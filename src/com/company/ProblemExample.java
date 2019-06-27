package com.company;

public class ProblemExample implements Problem {

    protected int a, b;

    @Override
    public String solution() {
        return a + b + "";
    }

    @Override
    public void initInput() {
        a = 1;
        b = 2;
    }
}
