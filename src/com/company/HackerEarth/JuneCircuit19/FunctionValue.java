package com.company.HackerEarth.JuneCircuit19;

import com.company.Problem;

import java.util.Scanner;

public class FunctionValue implements Problem {

    private int t;
    private int p;
    private int[] l;
    private int[] r;
    private Scanner input;

    @Override
    public String solution() {
        return null;
    }

    @Override
    public void initInput() {
        input = new Scanner(System.in);

        t = input.nextInt();
        p = input.nextInt();
        l = new int[t];
        r = new int[t];

        for (int i = 0; i < t; i++) {
            l[i] = input.nextInt();
            r[i] = input.nextInt();
        }
    }
}
