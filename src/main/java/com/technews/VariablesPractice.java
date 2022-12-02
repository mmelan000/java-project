package com.technews;

public class VariablesPractice {
    public static void main(String[] args) {
        int a = 4;
        double b = 3.5;
        String c = "cat";

        // has to be double since calculated sum would be a double? yeah, trying int throws error.
        double sum = a + b;

        // has to be String since final result would be String? yeah, trying int throws error.
        String concat = a + c;

        //expected output: 7.5, confirmed
        System.out.println(sum);
        //expected output: "4cat", confirmed
        System.out.println(concat);

    }
}
