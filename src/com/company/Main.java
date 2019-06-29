package com.company;

import com.company.HackerEarth.JuneCircuit19.FunctionValue;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 15; i++) {
            System.out.println(i + " ==> " + new FunctionValue().f(i));
        }
        System.out.println(new FunctionValue().solve(1, 3));
    }
}
