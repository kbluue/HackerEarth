package com.company;

import com.company.HackerEarth.JuneCircuit19.Rotation;

public class Main {

    public static void main(String[] args) {
        String test = "THink";
        for (int i = 0; i < 5; i++) {
            test = new Rotation().adjust(test);
            System.out.println(test);
        }
    }
}
