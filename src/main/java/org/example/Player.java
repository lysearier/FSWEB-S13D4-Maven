package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;

        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public int loseHealth(int damage) {
        healthPercentage -= damage;

        if (healthPercentage <= 0) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        }

        return healthPercentage;
    }

    public int restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;

        if (healthPercentage > 100) {
            healthPercentage = 100;
        }

        return healthPercentage;
    }
}
