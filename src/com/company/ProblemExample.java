package com.company;

import com.company.Problem;

public class ProblemExample implements Problem {

    private int a, b;

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
