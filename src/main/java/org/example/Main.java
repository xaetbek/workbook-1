package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Saiyan name:");
        String name = read.nextLine();
        System.out.print("Enter power level: ");
        int powerlevel = read.nextInt();

        Saiyan mySaiyan = new Saiyan("Remzoku", 8000, 100);
        Saiyan enemySaiyan = new Saiyan("Frieza", 10000, 200);


        // heroes with initial power level
        mySaiyan.displayInfo();
        enemySaiyan.displayInfo();

        // heroes after power transformation | Remzoku now a superhero
        mySaiyan.transform();
        mySaiyan.displayInfo();

        // Remzoku training hard and now power level is 9500 and ki 150
        mySaiyan.train();
        mySaiyan.displayInfo();

        // Turning Remzoku into Super Saiyan
        mySaiyan.transform();
        mySaiyan.displayInfo();

        // Let the blasting begin
        mySaiyan.blast(enemySaiyan); // Should print the blasting message
        mySaiyan.blast(enemySaiyan); // Will depend on remaining ki
        mySaiyan.blast(enemySaiyan); // May show exhaustion if ki < 30

        // Comparing the strength between mySaiyan and enemySaiyan
        mySaiyan.compareStrength(enemySaiyan);

        float damage = 19.524234f;
        Helper.showTwoDecimals(damage);
    }

}