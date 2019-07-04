package com.company.HackerEarth.JuneCircuit19.Test;

import com.company.HackerEarth.JuneCircuit19.MinimumMatrix;
import com.company.Test;

public class MinimumMatrixTest extends MinimumMatrix implements Test {
    @Override
    public void generateInput() {

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
