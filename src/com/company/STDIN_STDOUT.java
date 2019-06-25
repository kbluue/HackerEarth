package com.company;

import java.util.Scanner;

public class STDIN_STDOUT implements Runnable{

    private Code method;
    private Scanner scanner;

    STDIN_STDOUT(Code method){
        this.method = method;
    }

    private void initScanner(){
        scanner = new Scanner(System.in);
    }

    @Override
    public void process() {
        initScanner();
        method.setInput(scanner);
        method.process();
        scanner.close();
        System.out.println(method.getOutput());
    }
}
