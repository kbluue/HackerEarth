package com.company.HackerEarth.JuneCircuit19;

import com.company.Problem;

import java.util.Scanner;

public class FunctionValue implements Problem {

    protected int t, p;
    protected long[] l, r;

    private String stringSource;

    @Override
    public String solution() {
        return t + p + l[0] + r[0] + "";
    }

    @Override
    public void initInput() {
        Scanner input;
        if (stringSource == null) {
            input = new Scanner(System.in);
        } else {
            input = new Scanner(stringSource);
        }

        t = input.nextInt();
        p = input.nextInt();
        l = new long[t];
        r = new long[t];

        for (int i = 0; i < t; i++) {
            l[i] = input.nextLong();
            r[i] = input.nextLong();
        }
    }

    protected void setStringSource(String stringSource) {
        this.stringSource = stringSource;
    }

    private long modulo(int a, int b){
        return a%b;
    }

    public double f(long n){
        if (n < 1){
            return 0;
        } else if (n == 1 || n == 2){
            return 1;
        } else if (n%2 != 0){
            double x = n/2;
            return Math.pow(3, x);
        } else {
            double x = n/4;
            double y;
            if (n%4 == 0){
                y = (3 / 8.0 *(Math.pow(9, x) - 1)) - (9 / 8.0 * (Math.pow(9, x - 1) - 1));
            } else {
                y = 6 / 8.0 * (Math.pow(9, x) - 1);
            }
            return 1 + (2 * y);
        }
    }
}
