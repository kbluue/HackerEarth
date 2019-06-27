package com.company.HackerEarth.JuneCircuit19.Tests;

import com.company.HackerEarth.JuneCircuit19.MinimumMatrix;
import com.company.STDIN_STDOUT;

public class MinimumMatrixTest extends STDIN_STDOUT {

    private MinimumMatrixTest(){
        super(new MinimumMatrix());

//        String source = generateInput(15, 5);
        String source = setSource();

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
            input.append(line).append("\n");
        }
        return input.toString();
    }

    public String setSource() {
        return "15 5\n" +
                "5 1 9 9 6 \n" +
                "7 7 0 8 0 \n" +
                "2 5 6 5 4 \n" +
                "7 2 8 2 9 \n" +
                "4 6 0 6 7 \n" +
                "7 2 8 1 1 \n" +
                "5 6 7 4 2 \n" +
                "8 6 9 9 7 \n" +
                "8 5 3 4 7 \n" +
                "6 5 7 2 0 \n" +
                "3 7 8 5 9 \n" +
                "0 8 2 6 7 \n" +
                "7 4 3 7 7 \n" +
                "7 1 7 0 3 \n" +
                "1 9 0 5 9 ";
    }

    public static void main(String[] args) {
        new MinimumMatrixTest().process();
    }
}
