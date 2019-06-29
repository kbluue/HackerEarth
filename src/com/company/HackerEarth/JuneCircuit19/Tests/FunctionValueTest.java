package com.company.HackerEarth.JuneCircuit19.Tests;

import com.company.HackerEarth.JuneCircuit19.FunctionValue;
import com.company.Test;

import static com.company.InputGenerator.randomInt;
import static com.company.InputGenerator.randomLong;

public class FunctionValueTest extends FunctionValue implements Test {

    @Override
    public void generateInput() {
        t = 5;
        p = randomLong(1);
        l = new long[t];
        r = new long[t];

        for (int i = 0; i < t; i++) {
            l[i] = randomInt(1, 1000);
            r[i] = randomInt((int)l[i], 1000);
        }
    }

    @Override
    public void additionalAction() {
        initInput();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("t = ").append(t)
                .append("\np = ").append(p)
                .append("\n\n|     l     ||     p     |")
                .append("\n==========================");

        for (int i = 0; i < t; i++) {
            builder.append(String.format("\n|%9s  ||%9s  |", l[i], r[i]));
        }

        builder.append("\n");

        return builder.toString();
    }
}
