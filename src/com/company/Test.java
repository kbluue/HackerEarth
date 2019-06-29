package com.company;

public interface Test extends Problem {

    void generateInput();

    void setManualInput();

    void additionalAction();

    @Override
    default void run(){
        setInput(true);
        additionalAction();
        System.out.println(solution());
    }

    default void setInput(boolean auto){
        if (auto){
            generateInput();
        } else {
            setManualInput();
        }
    }
}
