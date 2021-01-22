package com.pluralsight.convertingnonstringtypestostring;

public class Main {

    public static void main(String[] args) {
        int iVal = 100;
        String sVal = String.valueOf(iVal);
        System.out.println(sVal);

        int i = 2, j = 3;
        int result = i * j;
        String output = i + " * " + j + " = " + result;
        System.out.println(output);
    }
}
