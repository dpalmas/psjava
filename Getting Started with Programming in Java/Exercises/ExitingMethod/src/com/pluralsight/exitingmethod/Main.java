package com.pluralsight.exitingmethod;

public class Main {

    public static void main(String[] args) {
        showSum(7.5f, 1.4f, 0);
        System.out.println("Back from showSum");
    }

    static void showSum(float x, float y, int count) {
        float sum = x + y;
        for (int i = 0; i < count; i++) {
            System.out.println(sum);
            return;
        }
    }
}
