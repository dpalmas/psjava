package com.pluralsight.formatflags;

public class Main {

	public static void main(String[] args) {
		int iVal = 32, iVal2 = 1234567, w = 5, x = 235, y = 481, z = 12;
		int iPosVal = 123, iNegVal = -456;
		double dVal = 1234567.0d;

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

		String s13 = String.format("%d", iVal2);
		String s14 = String.format("%,d", iVal2);
		String s15 = String.format("%,.2f", dVal);
		String s16 = String.format("%d", iPosVal);

		String s17 = String.format("%d", iNegVal);
		String s18 = String.format("% d", iPosVal);
		String s19 = String.format("% d", iNegVal);
		String s20 = String.format("%+d", iPosVal);

		String s21 = String.format("%+d", iNegVal);
		String s22 = String.format("%(d", iPosVal);
		String s23 = String.format("%(d", iNegVal);
		String s24 = String.format("% (d", iPosVal);

		FormatFlags(s1, s2, s3, s4);
		WidthFormatFlags(s5, s6, s7, s8, s9);
		WidthFormatFlags2(s10, s11, s12, s13, s14);
		WidthFormatFlags3(s15, s16, s17, s18, s19);
		WidthFormatFlags4(s20, s21, s22, s23, s24);
	}

	private static void FormatFlags(String s1, String s2, String s3, String s4) {
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

	private static void WidthFormatFlags(String s5, String s6, String s7, String s8, String s9) {
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
	}

	private static void WidthFormatFlags2(String s10, String s11, String s12, String s13, String s14) {
		System.out.println(s10);
		System.out.println(s11);
		System.out.println(s12);
		System.out.println(s13);
		System.out.println(s14);
	}

	private static void WidthFormatFlags3(String s15, String s16, String s17, String s18, String s19) {
		System.out.println(s15);
		System.out.println(s16);
		System.out.println(s17);
		System.out.println(s18);
		System.out.println(s19);
	}

	private static void WidthFormatFlags4(String s20, String s21, String s22, String s23, String s24) {
		System.out.println(s20);
		System.out.println(s21);
		System.out.println(s22);
		System.out.println(s23);
		System.out.println(s24);
	}
}