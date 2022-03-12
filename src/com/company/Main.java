package com.company;

public class Main{

    public static void main(String[] args) {
        Boss otto = new Boss();
            otto.setHealth(666);
            otto.setDamage(777);
            otto.setTypeOfGuard("magic");
        System.out.println(otto.getHealth()+ " " +otto.getDamage() + " " + otto.getTypeOfGuard());


    }
    }

