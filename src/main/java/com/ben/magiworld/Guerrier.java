package com.ben.magiworld;

import java.util.Scanner;

public class Guerrier extends Character {
    Scanner sc = new Scanner(System.in);
    private int nbDamage;

    public Guerrier() {
        super();
    }

    @Override
    public String toString() {
        return  "Woarg je suis le Guerrier" + super.toString();
    }

    /**
     * Make equal damage in the strength of the player on the opponent.
     */
    @Override
    public int basicAttack() {
        nbDamage = getNbStrength();
        return nbDamage;
    }

    /**
     * Make equal damage in the strength of the player time two on the opponent.
     * The launching player the attack loses of the vitality: the value of its strength divided by 2.
     * @return damage deal
     */
    /**@Override
    public int specialAttack() {
            nbDamage = nbStrength *2;
       return nbStrength;
    }*/
}
