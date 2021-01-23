package com.pluralsight.formatflags;

public class Main {

    public static void main(String[] args) {
	    int iVal = 32, w = 5, x = 235, y = 481, z = 12;

	    /********** Format Flags ************/
	    String s1 = String.format("%d", iVal);
	    String s2 = String.format("%x", iVal);
	    String s3 = String.format("%#x", iVal);
	    String s4 = String.format("%#X", iVal);

	    /******* Width Format Flags ********/
	    String s5 = String.format("W:%d X:%d", w, x);
		String s6 = String.format("Y:%d Z:%d", y, z);
		String s7 = String.format("W:%4d X:%4d", w, x);
		String s8 = String.format("Y:%4d Z:%4d", y, z);

		String s9 = String.format("W:%04d X:%04d", w, x);
		String s10 = String.format("Y:%04d Z:%04d", y, z);
		String s11 = String.format("W:%-4d X:%-4d", w, x);
		String s12 = String.format("Y:%-4d Z:%-4d", y, z);

	    System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);

		System.out.println(s9);
		System.out.println(s10);
		System.out.println(s11);
		System.out.println(s12);
    }
}