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

    static int generateInt(int a, int b){
        if (a >= b){
            return a;
        }

        int randomInt = (int)(Math.random() * b);
        System.out.println(randomInt);
        if (randomInt >= a){
            return randomInt;
        } else {
            randomInt = generateInt(a, b);
        }
        return randomInt;
    }

    static int generateInt(int a){
        if (a > 0){
            return generateInt(0, a);
        } else {
            return generateInt(a, 0);
        }
    }
}
