package com.company.HackerEarth.JuneCircuit19.Tests;

import com.company.HackerEarth.JuneCircuit19.FunctionValue;
import com.company.Test;

import static com.company.InputGenerator.randomInt;
import static com.company.InputGenerator.randomLong;

public class FunctionValueTest extends FunctionValue implements Test {

    private final boolean autoInput = true;

    @Override
    public void generateInput() {
        if (autoInput) {
            t = randomInt(1, (int) Math.pow(10, 3));
            p = randomInt(1, (int) Math.pow(10, 9));
            l = new long[t];
            r = new long[t];

            for (int i = 0; i < t; i++) {
                l[i] = randomLong(18);
                r[i] = randomLong(l[i], (long)Math.pow(10, 18));
            }
        }
    }

    @Override
    public void setManualInput() {
        if (!autoInput){
            setStringSource("2 1 2 1 2 1");
            initInput();
        }
    }

    @Override
    public void additionalAction() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("t = ").append(t)
                .append("\np = ").append(p)
                .append(String.format("\n\n|%10s%10s||%10s%10s|", "t", "", "p", ""))
                .append("\n============================================");

        for (int i = 0; i < t; i++) {
            builder.append(String.format("\n| %18s || %18s |", l[i], r[i]));
        }

        builder.append("\n");

        return builder.toString();
    }
}
