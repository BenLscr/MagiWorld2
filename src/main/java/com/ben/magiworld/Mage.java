package com.ben.magiworld;

import java.util.Scanner;

public class Mage extends Character {
    Scanner sc = new Scanner(System.in);
    private int nbDamage;

    public Mage() {
        super();
    }

    @Override
    public String toString() {
        return  "Abracadabra je suis le Mage" + super.toString();
    }



    /**
     * Make equal damage in the intelligence of the player on the opponent.
     * @return damage deal
     */
    @Override
    public int basicAttack() {
        nbDamage = getNbIntelligence();
        return nbDamage;
    }

    /**
     *The player health his life and gets back to his quantity of intelligence time 2 in points of life.
     *Watch out, he cannot have more life than he had it at first.
     * @return viltality
     */
    /**@Override
    public int specialAttack() {
        nbVitality = nbVitality + (nbIntelligence * 2);
       return nbVitality;
    }*/
}
