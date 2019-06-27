package com.company.HackerEarth.JuneCircuit19.Test;

import com.company.Code;
import com.company.HackerEarth.JuneCircuit19.MinimumMatrix;
import com.company.STDIN_STDOUT;

public class MinimumMatrixCloneTest extends STDIN_STDOUT {

    MinimumMatrix clone;

    public MinimumMatrixCloneTest() {
        super(new MinimumMatrix());
        setSource("2 2\n" +
                "1 2\n" +
                "3 4\n");
    }

    public static void main(String[] args) {
        MinimumMatrixCloneTest base = new MinimumMatrixCloneTest();
//        MinimumMatrix code = base.get
        base.process();
    }
}
