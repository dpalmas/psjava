package com.pluralsight.typeconversion;

public class Main {

    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = byteVal; // compilador faz a conversão automática porque short é maior que byte.
        // short result1 = longVal; // tipos incompatíveis a própria IDE sugere fazer o cast para 'short'.
        short result3 = (short) longVal;
        short result4 = (short) (byteVal - longVal);
        // long  result5 = longVal - floatVal; // convertendo-se para 'long' nos colocaria em perigo de perder a porção decimal do resultado
        float result6 = longVal - floatVal; // melhor maneira é deixar a variável como float.

        System.out.println("Success");
    }
}