package org.example;

public class Saiyan {
    private String name;
    private int powerLevel;
    private int ki;
    private boolean superSaiyan;

    public Saiyan(String name, int powerLevel, int ki) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.ki = ki;
        this.superSaiyan = false; // default value
    }

    // Create a method to display info
    public void displayInfo() {
        System.out.println("=== Saiyan Status ===");
        System.out.println("Name: " + name);
        System.out.println("Power Level: " + powerLevel);
        System.out.println("Ki: " + ki);
        System.out.println("Super Saiyan: " + (superSaiyan ? "Yes 🔥" : "No"));
        System.out.println("===============");

    }

    // Create a method to make it superSaiyan
    public void transform() {
        if (powerLevel >= 9000 && superSaiyan == false) {
            this.superSaiyan = true;
            this.powerLevel = this.powerLevel * 2;
            System.out.println("Remzoku transformed into a Super Saiyan! 💛 Power Level doubled to " + powerLevel + "!");
        } else {
            System.out.println("Remzoku is not ready to transform yet. 😤");
        }
    }

    public void train() {
        this.powerLevel = 9500;
        this.ki = 150;
        System.out.println("Remzoku is training hard... Power Level is now 9500 🔥");
    }

    public void blast(Saiyan enemy) {
        if (this.ki >= 30) {
            this.ki -= 30;
            enemy.ki -= 20;
            System.out.println(this.name + " blasts " + enemy.name +
                    " with a Kamehameha! 💥 " + enemy.name + "'s Ki drops to " +
                    enemy.ki + ". " + this.name + "'s Ki is now " + this.ki + ".");
        } else {
            System.out.println("Remzoku is too tired to blast! 😵");
        }
    }

    public void compareStrength(Saiyan _enemy) {
        int highestNum = Math.max(this.powerLevel, _enemy.powerLevel);
        if (this.powerLevel != highestNum) {
            System.out.println(_enemy.name + " Is stronger than you with a power level of " + _enemy.powerLevel);
        } else {
            System.out.println();
            System.out.println(this.name + ", you are the strongest with a power level of " + this.powerLevel);
        }
    }
}