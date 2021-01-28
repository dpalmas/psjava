package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        performCalculations();
    }

    private static void performCalculations() {
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'a', 's', 'm', 'd'};
        double[] results = new double[opCodes.length];

        for (int i = 0; i < opCodes.length; i++) {
            results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
        }
        for (double currentResult : results) {
            System.out.println("result = " + currentResult);
        }
    }


}