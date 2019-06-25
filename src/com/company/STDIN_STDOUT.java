package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class STDIN_STDOUT implements Runnable{

    private Code method;
    private Scanner scanner;
    private String source;

    public STDIN_STDOUT(Code method){
        this.method = method;
    }

    private void initScanner(){
        if (source == null) {
            scanner = new Scanner(System.in);
        } else {
            scanner = new Scanner(source);
        }
    }

    public void setSource(String source) {
        this.source = source;
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
