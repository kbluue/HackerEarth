package com.company;

public interface Test extends Problem {

    void generateInput();

    void additionalAction();

    @Override
    default void run(){
        generateInput();
        additionalAction();
        System.out.println(solution());
    }
}
