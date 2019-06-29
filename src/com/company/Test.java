package com.company;

import java.lang.reflect.Method;

public class Test implements Problem {

    boolean autoInput;
    Object problem;

    Test(Object problem){
        this.problem = problem;
        Method[] methods = problem.getClass().getMethods();
        for (Method m : methods){
            System.out.println(m.toGenericString() + "\n");
        }
    }

//    abstract void generateInput();
//
//    abstract void setManualInput();
//
//    abstract void additionalAction();

    protected void setAutoInput(boolean autoInput) {
        this.autoInput = autoInput;
    }

    @Override
    public String solution() {
        return null;
    }

    @Override
    public void initInput() {

    }

    @Override
    public void run(){
//        if (autoInput) generateInput();
//        else setManualInput();
//
//        additionalAction();
        System.out.println(solution());
    }

    public boolean isProblem() {
        Class<?> clazz = problem.getClass();
        return Problem.class.isAssignableFrom(clazz);
    }
}
