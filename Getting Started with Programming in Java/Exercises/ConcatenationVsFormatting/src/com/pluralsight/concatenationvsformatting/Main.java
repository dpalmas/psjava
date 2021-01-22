package com.pluralsight.concatenationvsformatting;

public class Main {

    public static void main(String[] args) {
	    int pedro = 15, diana = 14, gessica = 13, bianca = 12;
	    double avgDiff = ((pedro - diana) + (diana - gessica) + (gessica - bianca)) / 3.0d;
	    String s1 = "Meus sobrinhos tem " + pedro + ", " + diana + ", " + gessica +
                ", and " + bianca + " anos de idade";

	    String s2 = String.format(
	            "Meus sobrinhos tem %d, %d, %d e %d anos de idade",
                pedro, diana, gessica, bianca);

	    String s3 = "A média de idade entre cada um é " + avgDiff + " anos.";

	    String s4 = String.format(
	            "A média de idade entre cada um é %.1f anos", avgDiff
        );
    }
}
