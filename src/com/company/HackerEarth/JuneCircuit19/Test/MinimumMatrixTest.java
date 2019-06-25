package com.company.HackerEarth.JuneCircuit19.Test;

import com.company.HackerEarth.JuneCircuit19.MinimumMatrix;
import com.company.STDIN_STDOUT;

public class MinimumMatrixTest extends STDIN_STDOUT {

    private MinimumMatrixTest(){
        super(new MinimumMatrix());

        String source = generateInput(15, 5);

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

    public static void main(String[] args) {
        new MinimumMatrixTest().process();
    }
}
