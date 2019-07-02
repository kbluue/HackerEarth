package com.company.HackerEarth.JuneCircuit19;

import com.company.Problem;

import java.util.Scanner;

public class Rotation implements Problem {

    protected int n;
    protected String s, t;

    @Override
    public String solution() {
        String t1 = t;
        String t2 = t;

        if (s.length() == t.length()){
            for (int i = 0; i < n; i++) {
                if (s.equals(t1) || s.equals(t2)){
                    return i + "";
                }
                t1 = adjust(t1, true);
                t2 = adjust(t2, false);
            }
        }
        return "-1";
    }

    @Override
    public void initInput() {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        s = sc.next();
        t = sc.next();
    }

    private String adjust(String in, boolean forward) {
        if (forward) return in.substring(1) + in.charAt(0);
        else return in.charAt(in.length() - 1) + in.substring(0, in.length() -1);
    }
}
