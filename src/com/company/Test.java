package com.company;

public interface Test extends Problem {

    void generateInput();

    void setManualInput();

    void additionalAction();

    @Override
    default void run(){
        generateInput();
        setManualInput();
        additionalAction();
        System.out.println(solution());
    }
}
