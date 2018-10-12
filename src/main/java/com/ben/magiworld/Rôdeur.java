package com.ben.magiworld;

import java.util.Scanner;

public class Rôdeur extends Character {
    Scanner sc = new Scanner(System.in);
    private int nbDamage;

    public Rôdeur() {
        super();
    }

    @Override
    public String toString() {
        return  "Gnehehe je suis le Rôdeur" + super.toString();
    }

    /**
     * Make equal damage in the agility of the player on the opponent.
     * @return damage deal
     */
    @Override
    public int basicAttack() {
        nbDamage = getNbAgility();
        return nbDamage;
    }

    /**
     *The player wins his level divided by 2 in agility.
     * @return agility add
     */
    /**@Override
    public int specialAttack() {
        nbAgility = nbAgility + (nbLevel / 2);
        return nbAgility;
    }*/
}
