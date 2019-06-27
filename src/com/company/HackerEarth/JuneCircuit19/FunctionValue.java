package com.company.HackerEarth.JuneCircuit19;

import com.company.Code;

public class FunctionValue extends Code {

    private int t, p, l[], r[];

    @Override
    protected String codeBody() {
        return null;
    }

    @Override
    protected void setInputs() {
        t = input.nextInt();
        p = input.nextInt();
        l = new int[t];
        r = new int[t];

        for (int i = 0; i < t; i++) {
            l[i] = input.nextInt();
            r[i] = input.nextInt();
        }
    }
}
