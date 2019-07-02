package com.company.HackerEarth.JuneCircuit19;

import com.company.Problem;

import java.util.Scanner;

public class Rotation implements Problem {

    private int n;
    private String s, t;

    @Override
    public String solution() {
        return null;
    }

    @Override
    public void initInput() {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        s = sc.next();
        t = sc.next();
    }

    public String adjust(String in) {
        return in.substring(1) + in.charAt(0);
    }
}
