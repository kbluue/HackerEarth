package com.company.HackerEarth.JuneCircuit19;

import com.company.Problem;

import java.util.Scanner;

public class FunctionValue implements Problem {

    protected int t, p;
    protected long[] l, r;

    private String stringSource;

    @Override
    public String solution() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < t; i++) {
            builder.append(modulo(solve(l[i], r[i]), p)).append("\n");
        }
        return builder.toString();
    }

    @Override
    public void initInput() {
        Scanner input;
        if (stringSource == null) {
            input = new Scanner(System.in);
        } else {
            input = new Scanner(stringSource);
        }

        t = input.nextInt();
        p = input.nextInt();
        l = new long[t];
        r = new long[t];

        for (int i = 0; i < t; i++) {
            l[i] = input.nextLong();
            r[i] = input.nextLong();
        }
    }

    protected void setStringSource(String stringSource) {
        this.stringSource = stringSource;
    }

    private long modulo(long a, int b){
        return a%b;
    }

    public double f(long n){
        if (n < 1){
            return 0;
        } else if (n == 1 || n == 2){
            return 1;
        } else if (n%2 != 0){
            double x = n/2;
            return Math.pow(3, x);
        } else {
            double x = n/4;
            double y;
            if (n%4 == 0){
                y = (3 / 8.0 *(Math.pow(9, x) - 1)) - (9 / 8.0 * (Math.pow(9, x - 1) - 1));
            } else {
                y = 6 / 8.0 * (Math.pow(9, x) - 1);
            }
            return 1 + (2 * y);
        }
    }

    public double sumType1(long x, long n){
        return (Math.pow(3, x)*(Math.pow(3, n) - 1)) / 2.0;
    }

    public double sumType2(long x, long n){
        return (3 / 16.0)*(Math.pow(9, x))*(Math.pow(9, n) - 1) - (n / 2.0);
    }

    public double sumType3(long x, long n){
        return 1 / 4.0 * ((Math.pow(3, 2 * x + 1) / 8.0)*(Math.pow(9, n) - 1)
                - (Math.pow(9, x) / 8.0)*(Math.pow(9, n) - 1)
                + (10 * n));
    }

    public long solve(long l, long r){
        System.out.println(l + "//" + r);

        long l1 = l;
        long r1 = r;
        if (l1%2 == 0){
            l1++;
        }
        if (r1%2 == 0){
            r1--;
        }
        long x = l1 / 2;
        long n = (r1 - l1) / 2 + 1;
        double sum1 = sumType1(x, n);
        System.out.println(l + "//" + r);
        System.out.println(l1 + "//" + r1);

        l1 = l;
        r1 = r;
        while (l1%4 != 0){
            l1++;
        }
        while (r1%4 != 0){
            r1--;
        }
        x = l1/4;
        long n1 = (r1 - l1) / 4 + 1;
        double sum3 = sumType3(x, n1);
        System.out.println(l1 + "//" + r1);

        l1 = l;
        while (l1%2 == 1 || l1%4 == 0){
            l1++;
        }
        x = l1/4;
        long n3 = r - l + 1 - n1 - n;
        double sum2 = sumType2(x, n3);
        System.out.println(l1 + "//" + r1);
        return (long) (sum1 + sum2 + sum3);
    }

    public void printResult(){
        for (int i = 0; i < t; i++) {
            System.out.println(modulo(solve(l[i], r[i]), p));
        }
    }
}
