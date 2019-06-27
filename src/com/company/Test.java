package com.company;

public abstract class Test implements Problem{

    Problem problem;

    public Test(Problem problem) {
        this.problem = problem;
    }

    abstract void generateInput();

    @Override
    public void run(){
        generateInput();
        System.out.println(problem.solution());
    }
}
