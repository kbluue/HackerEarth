package com.company.HackerEarth.JuneCircuit19;

import com.company.Problem;

import java.util.Scanner;

public class MinimumMatrix implements Problem {

    protected int m, n;
    protected long[][] values;
    private String source;

    @Override
    public String solution() {
        return null;
    }

    @Override
    public void initInput() {
        Scanner s;
        if (source == null){
            s = new Scanner(System.in);
        } else {
            s = new Scanner(source);
        }

        m = s.nextInt();
        n = s.nextInt();
        values = new long[m][n];

        int i = 0, j = 0;
        while (j < n){
            values[i][j] = s.nextLong();
            i++;
            if (i >= m){
                i = 0;
                j++;
            }
        }
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void printValues(){
        if (values == null){
            System.out.println("Values has not been initialized");
        } else {
            System.out.println(m + " " + n);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(values[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
