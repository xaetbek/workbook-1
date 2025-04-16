package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Prompt user for hours worked
        System.out.print("Enter hours worked: ");
        float hoursWorked = input.nextFloat();

        // Prompt user for pay rate
        System.out.print("Enter pay rate: ");
        float payRate = input.nextFloat();

        // Calculate gross pay
        float grossPay = hoursWorked * payRate;

        // Display name and gross pay
        System.out.println("\nPayroll Summary:");
        System.out.println("Employee Name: " + name);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);

        input.close();
    }
}

