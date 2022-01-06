package com.codedifferently.labs.lab10.part_a.examples;

public class Example03_ParameterizedMethod {
    static void MultiplicationMethod(int a, int b) {
        System.out.println(a * b);
    }
    static void MethodWithStrings(String firstName, String lastName) {
        System.out.println("Hello, my full name is " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        MultiplicationMethod(5,5);
        MethodWithStrings("Kaleb", "Burd");
    }
}
