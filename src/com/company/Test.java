package com.company;

public abstract class Test implements Runnable{

    Code code;

    public Test(Code code) {
        this.code = code;
    }

    public abstract void generateInput();

    @Override
    public void process() {
        code.process();
        System.out.println(code.getOutput());
    }
}
