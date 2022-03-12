package com.company;

public class Hero {
    private int superAbility;
    private int health;
    private double damage;

    public Hero(int superAbility, int health, double damage) {
        this.superAbility = superAbility;
        this.damage = damage;
        this.health = health;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }


    public int getSuperAbility() {
        return superAbility;
    }


    public double getDamage() {
        return damage;


    }
}
