package com.company;

public interface Test extends Problem {

    void generateInput();

    @Override
    default void run(){
        generateInput();
        System.out.println(solution());
    }
}
