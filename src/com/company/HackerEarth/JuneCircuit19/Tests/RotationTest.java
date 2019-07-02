package com.company.HackerEarth.JuneCircuit19.Tests;

import com.company.HackerEarth.JuneCircuit19.Rotation;
import com.company.Test;

import static com.company.InputGenerator.randomInt;

public class RotationTest extends Rotation implements Test {

    private final boolean auto = true;

    @Override
    public void generateInput() {
        if (auto){
            n = randomInt(1000);
            s = randomString(n);
            int n1 = randomInt(n);
            t = s.substring(n1) + s.substring(0, n1) + 'a';
            System.out.println("n1 ==> " + n1);
        }
    }

    @Override
    public void setManualInput() {
        if (!auto){
            n = 3;
            s = "bad";
            t = "adb";
        }
    }

    @Override
    public void additionalAction() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return n + "\n" + s + "\n" + t;
    }

    private String randomString(int length){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++) {
            s.append((char) randomInt(98, 123));
        }
        return s.toString();
    }
}
