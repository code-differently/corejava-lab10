package com.codedifferently.labs.lab10.part_a.examples;

public class Example01_TaxTotal {
    public static void main(String[] args) {
        double priceOfCoffee = 2;
        double totalWithTax = priceOfCoffee * .10 + priceOfCoffee;
        System.out.println(totalWithTax);
    }
}