package com.company.HackerEarth.JuneCircuit19;

import com.company.Problem;

import java.util.Scanner;

public class DetermineTheWinner implements Problem {

    protected int t;
    protected long[] n, k;

    @Override
    public String solution() {
        String solution = "";
        for (int i = 0; i < t; i++) {
            long turns = n[i] / k[i];
            if (n[i]%k[i] != 0){
                turns++;
            }
            if (turns%2 == 1){
                solution = solution.concat("Arpa\n");
            } else {
                solution = solution.concat("Dishant\n");
            }
        }
        return solution;
    }

    @Override
    public void initInput() {
        Scanner s = new Scanner(System.in);
        t = s.nextInt();
        n = new long[t];
        k = new long[t];

        for (int i = 0; i < t; i++) {
            n[i] = s.nextLong();
            k[i] = s.nextLong();
        }
    }
}
