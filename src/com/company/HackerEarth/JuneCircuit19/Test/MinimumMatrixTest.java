package com.company.HackerEarth.JuneCircuit19.Test;

import com.company.HackerEarth.JuneCircuit19.MinimumMatrix;
import com.company.STDIN_STDOUT;

import java.util.Scanner;

public class MinimumMatrixTest extends STDIN_STDOUT {

    String source;

    MinimumMatrixTest(){
        super(new MinimumMatrix());

//        source = generateInput(15, 5);

        source = "15 5\n" +
                "2 2 0 9 9 \n" +
                "6 8 2 3 7 \n" +
                "1 1 7 5 3 \n" +
                "7 8 9 1 6 \n" +
                "8 7 1 2 0 \n" +
                "6 3 5 9 8 \n" +
                "6 9 8 3 0 \n" +
                "5 3 3 4 5 \n" +
                "6 4 8 0 1 \n" +
                "6 3 1 6 0 \n" +
                "6 7 6 2 4 \n" +
                "4 2 5 4 9 \n" +
                "7 6 8 9 2 \n" +
                "2 1 9 1 7 \n" +
                "7 1 0 5 5 ";

        setSource(source);
        System.out.println(source);
    }

    private String generateInput(int m,int n){
        StringBuilder input = new StringBuilder(m + " " + n + "\n");
        for (int i = 0; i < m; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < n; j++) {
                line.append((int) (Math.random() * 10)).append(" ");
            }
            input.append(line + "\n");
        }
        return input.toString();
    }

    public static void main(String[] args) {
        new MinimumMatrixTest().process();
    }
}
