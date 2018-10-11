package com.ben.magiworld;

import java.util.Scanner;

public class Rôdeur extends Character {
    Scanner sc = new Scanner(System.in);
    private int nbDamage;

    @Override
    public void Character() {
        super.Character();
    }

    @Override
    public int basicAttack() {
        nbDamage = nbAgility;
        return nbDamage;
    }

    @Override
    public int specialAttack() {
        nbAgility = nbAgility + (nbLevel / 2);
        return nbAgility;
    }
}
