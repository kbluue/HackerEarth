package com.company;

public interface Problem extends java.lang.Runnable {

    String solution();

    void initInput();

    default void run(){
        initInput();
        System.out.println(solution());
    }
}
