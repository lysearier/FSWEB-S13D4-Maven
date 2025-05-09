package org.example;

public enum Weapon {
    SWORD(5, 3.1);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public int getDamage() {
        return damage;
    }
}
