package com.company;

public interface Problem extends Runnable{

    String solution();

    void initInput();

    default void run(){
        initInput();
        System.out.println(solution());
    }
}
