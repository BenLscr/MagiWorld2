package com.ben.magiworld;

import java.util.Scanner;

public class Mage extends Character {
    Scanner sc = new Scanner(System.in);
    private int nbDamage;

    @Override
    public void Character() {
        super.Character();
    }

    @Override
    public int basicAttack() {
        nbDamage = nbIntelligence;
        return nbDamage;
    }

    @Override
    public int specialAttack() {
        nbVitality = nbVitality + (nbIntelligence * 2);
       return nbVitality;
    }
}
