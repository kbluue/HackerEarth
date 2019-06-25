package com.company.HackerEarth.JuneCircuit19.Test;

import com.company.HackerEarth.JuneCircuit19.MinimumMatrix;
import com.company.STDIN_STDOUT;

import java.util.Scanner;

public class MinimumMatrixTest extends STDIN_STDOUT {

    MinimumMatrixTest(){
        super(new MinimumMatrix());
        setSource(generateInput(15, 5));
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
