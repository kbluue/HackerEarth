package com.company;

import java.util.Scanner;

public abstract class Code implements Runnable{

    private String output;

    protected Scanner input;

    String getOutput(){
        return output;
    }

    void setInput(Scanner input) {
        this.input = input;
    }

    private void setOutput(String output) {
        this.output = output;
    }

    protected abstract String codeBody();

    protected abstract void setInputs();

    @Override
    public final void process(){
        setInputs();
        String result = codeBody();
        setOutput(result);
    }
}
