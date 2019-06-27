package com.company;

import static com.company.InputGenerator.randomInt;

public class TestExample extends ProblemExample implements Test {

    @Override
    public void generateInput() {
        a = randomInt(8, 10);
        b = randomInt(10);
    }
}
