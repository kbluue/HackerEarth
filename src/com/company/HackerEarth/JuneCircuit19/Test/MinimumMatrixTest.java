package com.company.HackerEarth.JuneCircuit19.Test;

import com.company.HackerEarth.JuneCircuit19.MinimumMatrix;
import com.company.InputGenerator;
import com.company.Test;

public class MinimumMatrixTest extends MinimumMatrix implements Test {
    @Override
    public void generateInput() {
        StringBuilder builder = new StringBuilder();

        double rangeProbability = Math.random();
        int nRange;

        if (rangeProbability < 0.166){
            nRange = 5;
        } else {
            nRange = 500;
        }

        m = InputGenerator.randomInt(1, 500);
        n = InputGenerator.randomInt(1, nRange);

        builder.append(m).append(" ").append(n).append("\n");
        int mn = m * n;
        for (int i = 0; i < mn; i++) {
            builder.append(InputGenerator.randomLong(9)).append(" ");
        }
    }

    @Override
    public void setManualInput() {
        setSource("2 3 2 2 2 2 3 3 6 4");
        initInput();
    }

    @Override
    public void additionalAction() {
        printValues();
    }
}
