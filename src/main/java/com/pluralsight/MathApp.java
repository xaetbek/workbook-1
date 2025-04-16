package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Q1. Declare variables here
        double bobSalary = 180000.00;
        double garySalary = 205000.00;
        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is: $" + highestSalary);

        // Q2. De
        double carPrice = 17000.0;
        double truckPrice = 32000.0;

        double smallestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The smallest price is: $" + smallestPrice);

        // Q7. The last question in the exercise
        double number = Math.random();
        System.out.println("This is a random number between 0 and 1: " + number);


    }
}
