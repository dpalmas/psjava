package com.pluralsight.argumentindex;

public class Main {

    public static void main(String[] args) {
	    int valA = 100, valB = 200, valC = 300;

	    String s1 = String.format("%d %d %d", valA, valB, valC);
	    String s2 = String.format("%3$d %1$d %2$d", valA, valB, valC);
	    String s3 = String.format("%2$d %<d %1$d", valA, valB, valC);
	    System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
    }
}
