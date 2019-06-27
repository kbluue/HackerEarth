package com.company;

public interface Test extends Problem {

    void generateInput();

    @Override
    default void run(){
        generateInput();
        System.out.println(solution());
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
