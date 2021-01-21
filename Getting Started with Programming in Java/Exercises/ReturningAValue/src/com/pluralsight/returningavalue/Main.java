package com.pluralsight.returningavalue;

public class Main {

    public static void main(String[] args) {
	    double result = calculeInterest(100.0d, 0.05d, 10);
	    System.out.println(result);
    }

    static double calculeInterest(double amt, double rate, int years) {
        return amt * rate * years;
    }
}
