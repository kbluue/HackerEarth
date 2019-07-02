package com.company.HackerEarth.JuneCircuit19.Tests;

import com.company.HackerEarth.JuneCircuit19.DetermineTheWinner;
import com.company.Test;

import static com.company.InputGenerator.randomInt;
import static com.company.InputGenerator.randomLong;

public class DTW_Test extends DetermineTheWinner implements Test {

    private final boolean auto = false;

    @Override
    public void generateInput() {
        if (auto){
            t = randomInt(1,(int)Math.pow(10, 3));
            n = new long[t];
            k = new long[t];

            for (int i = 0; i < t; i++) {
                n[i] = randomLong(3);
                k[i] = randomLong(1, n[i]);
            }
        }
    }

    @Override
    public void setManualInput() {
        if (!auto){
            t = 2;
            n = new long[]{5, 2};
            k = new long[]{2, 1};
        }
    }

    @Override
    public void additionalAction() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String output = t + "\n";
        for (int i = 0; i < t; i++) {
            output += (n[i] + " " + k[i] + "\n");
        }
        return output;
    }
}
