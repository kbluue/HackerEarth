package com.company;

public class InputGenerator {

    public static int randomInt(int a, int b){
        if (a >= b){
            return a;
        }

        int randomInt = (int)(Math.random() * b);
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

    public static long randomLong(long a, long b){
        if (a >= b){
            return a;
        }

        long randomLong = (long) (Math.random() * b);
        if (randomLong >= a){
            return randomLong;
        } else {
            randomLong = randomLong(a, b);
        }
        return randomLong;
    }

    public static long randomLong(long a){
        if (a > 0){
            return randomLong(0, a);
        } else {
            return randomLong(a, 0);
        }
    }

    public static long randomLong(int powerOf10){
        return randomLong(1, (long)Math.pow(10, powerOf10));
    }
}
