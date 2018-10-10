package com.ben.magiworld;

import java.util.Scanner;

public class Guerrier extends Character {
    Scanner sc = new Scanner(System.in);

    public Guerrier() {
        super();
    }

    /**@Override
    public void setNbVitality(int nbVitality) {
        this.nbVitality = nbVitality * 5;
    }

    @Override
    public void setNbStrength(int nbStrength) {
        do {
            System.out.println("Force du personnage ?");
            nbStrength = sc.nextInt();
        } while (nbStrength > nbLevel);
    }

    @Override
    public void setNbAgility(int nbAgility) {
        do {
            System.out.println("Agilité du personnage ?");
            nbAgility = sc.nextInt();
        } while (!(nbAgility <= nbLevel - nbStrength));
    }

    @Override
    public void setNbIntelligence(int nbIntelligence) {
        do {
            System.out.println("Intelligence du personnage ?");
            nbIntelligence = sc.nextInt();
        } while (nbIntelligence != nbLevel - (nbStrength + nbAgility));
    }
    */

}
