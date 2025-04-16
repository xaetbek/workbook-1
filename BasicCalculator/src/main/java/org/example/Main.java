package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two numbers
        System.out.print("Hello there! Welcome to my Basic Calculator app. Let's go!\n" +
                "Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();

        // Display menu
        System.out.println("\nPossible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("\nPlease select an option: ");
        char option = scanner.next().toUpperCase().charAt(0); // Make it case-insensitive

        // Perform operation using if-else
        if (option == 'A') {
            System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1 + num2);
        } else if (option == 'S') {
            System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1 - num2);
        } else if (option == 'M') {
            System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1 * num2);
        } else if (option == 'D') {
            if (num2 != 0) {
                System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1 / num2);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid option selected.");
        }

        scanner.close();
    }
}
