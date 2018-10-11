package com.ben.magiworld;

import java.util.Scanner;

public class Guerrier extends Character {
    Scanner sc = new Scanner(System.in);
    private int nbDamage;

    @Override
    public void Character() {
        super.Character();
    }

    @Override
    public int getNbVitality() {
        return super.getNbVitality();
    }

    @Override
    public int basicAttack() {
        nbDamage = nbStrength;
        return nbDamage;
    }

    /**@Override
    public int specialAttack() {
            nbDamage = nbStrength *2;
       return ;
    }*/
}
