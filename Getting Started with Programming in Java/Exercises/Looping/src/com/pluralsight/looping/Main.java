package com.pluralsight.looping;

public class Main {

    public static void main(String[] args) {
        /*
          ************************
                While loop
          ************************
         */
        int someValue = 4;
        int factorial = 1;

        while(someValue > 1) {
            factorial *= someValue;
            someValue--;
        }

        System.out.println(factorial);
        System.out.println();

        /*
          ************************
               Do-while loop
          ************************
         */
        int iVal = 5;
        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while(iVal < 25);
        System.out.println();

        /*
          ************************
                For loop
          ************************
         */
        for(int i = 1; i < 100; i *= 2)
            System.out.println(i);
    }
}