package com.plagahoa777.hgjj.utils;

public class Calculator {
    public static String getDivisibleOutput(int numerator) {
        String output = "เลขหารลงตัว : ";
        for (int i = 2; i < numerator; i++) {
            if (numerator % i == 0) {
                output += i + ", ";
            }
        }
        return output;
    }
}
