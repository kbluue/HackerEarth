package com.company;

public class TestExample extends ProblemExample implements Test {

    @Override
    public void generateInput() {
        a = Test.generateInt(8, 10);
        b = Test.generateInt(10);
    }
}
