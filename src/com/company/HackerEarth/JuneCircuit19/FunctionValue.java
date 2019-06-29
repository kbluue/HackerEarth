package com.company.HackerEarth.JuneCircuit19;

import com.company.Problem;

import java.util.Scanner;

public class FunctionValue implements Problem {

    protected int t;
    protected long p, l[], r[];
    private Scanner input;

    @Override
    public String solution() {
        return t + p + l[0] + r[0] + "";
    }

    @Override
    public void initInput() {
        input = new Scanner(System.in);

        t = input.nextInt();
        p = input.nextLong();
        l = new long[t];
        r = new long[t];

        for (int i = 0; i < t; i++) {
            l[i] = input.nextLong();
            r[i] = input.nextLong();
        }
    }
}
