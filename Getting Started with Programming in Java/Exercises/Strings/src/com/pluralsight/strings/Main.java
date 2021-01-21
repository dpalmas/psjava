package com.pluralsight.strings;

public class Main {

    public static void main(String[] args) {
        String name = "Davi";
        String greeting = "Hello " + name;
        System.out.println(greeting);
        greeting += " good to see you!";
        System.out.println(greeting);
    }
}
