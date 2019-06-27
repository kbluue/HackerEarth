package com.company;

public class InputGenerator {

    public static int randomInt(int a, int b){
        if (a >= b){
            return a;
        }

        int randomInt = (int)(Math.random() * b);
        System.out.println(randomInt);
        if (randomInt >= a){
            return randomInt;
        } else {
            randomInt = randomInt(a, b);
        }
        return randomInt;
    }

    public static int randomInt(int a){
        if (a > 0){
            return randomInt(0, a);
        } else {
            return randomInt(a, 0);
        }
    }
}