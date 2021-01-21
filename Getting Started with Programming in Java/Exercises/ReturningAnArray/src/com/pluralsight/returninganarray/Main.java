package com.pluralsight.returninganarray;

public class Main {

    public static void main(String[] args) {
        double result = calculateInterest(100d, 0.05d, 10);
	    System.out.println(result);
    }

    static double calculateInterest(double amt, double rate, int year) {
        return amt * rate * year;
    }

    static double[] produceInterestHistory(double amt, double rate, int years) {
        double[] accumlatedInterest = new double[years];
        for (int yearIndex = 0; yearIndex < years; yearIndex++) {
            int year = yearIndex + 1;
            accumlatedInterest[yearIndex] = calculateInterest(amt, rate, year);
        }
        return accumlatedInterest;
    }
}
