package com.company.HackerEarth.JuneCircuit19;

import com.company.Code;

public class Rotation extends Code {

    private int n;
    private String s, t;

    @Override
    public String codeBody() {
        if (s.length() == t.length()){
            if (s.length() == n){
                for (int i = 0; i < n; i++) {
                    if (s.equals(t)){
                        return i + "";
                    }
                    s  = adjust(s);
                }
            } else {
                return "Mismatch input conditions";
            }
        }

        return "No possible match";
    }

    @Override
    protected void setInputs() {
        n = Integer.parseInt(input.nextLine());
        s = input.nextLine();
        t = input.nextLine();
    }

    private String adjust(String s){
        return s.substring(1) + s.charAt(0);
    }
}
