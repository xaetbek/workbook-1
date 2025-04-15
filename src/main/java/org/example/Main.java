package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for sandwich size
        System.out.println("Welcome to the Sandwich Shop!");
        System.out.println("Please select the size of your sandwich:");
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large ($8.95)");
        System.out.print("Enter 1 or 2: ");
        int size = scanner.nextInt();

        double price = 0.0;

        if (size == 1) {
            price = 5.45;
        } else if (size == 2) {
            price = 8.95;
        } else {
            System.out.println("Invalid sandwich size selected.");
            return;
        }

        // Prompt for age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10; // 10% for students
        } else if (age >= 65) {
            discount = 0.20; // 20% for seniors
        }

        // Calculate final price
        double finalPrice = price - (price * discount);

        System.out.printf("Your total is: $%.2f%n", finalPrice);


//        System.out.print("Enter years of experience: ");
//        int experience = scanner.nextInt();
//
//        System.out.print("Enter the number of programming languages: ");
//        int languages = scanner.nextInt();
//
//        if (experience > 5 && languages > 3) {
//            System.out.println("You are a senior level developer!");
//        } else if (experience >= 2 && experience <= 5 && languages >= 2) {
//            System.out.println("You're a mid level developer.");
//        } else if (experience < 2 || languages < 2) {
//            System.out.println("You're a junior developer.");
//        } else {
//            System.out.println("You don't qualify.");
//        }
//
//        System.out.println();

        // If and Else Practice
//        System.out.print("Please, enter your username: ");
//        String username = scanner.nextLine();
//
//        System.out.print("Please, enter your password: ");
//        String password = scanner.nextLine();
//
//        if (!username.isEmpty() && !(!password.equals("secret123"))) {
//            System.out.println("Access granted, welcome " + username);
//        } else {
//            System.out.println("Incorrect username or password");
//        }
    }
}