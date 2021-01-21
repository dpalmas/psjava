package com.pluralsight.arrays;

public class Main {

    public static void main(String[] args) {
        float[] theVals = new float[3];
        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 15.0f;
        float sum = 0.0f;

        for(int index = 0;  index < theVals.length; index++)
            sum+= theVals[index];
        System.out.println(sum);
    }
}
