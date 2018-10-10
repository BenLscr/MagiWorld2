package com.ben.magiworld;

import java.util.Scanner;

public class Character {
    protected int nbLevel;
    protected int nbVitality;
    protected int nbStrength;
    protected int nbAgility;
    protected int nbIntelligence;
    Scanner sc = new Scanner(System.in);

    public Character() {
        this.nbLevel = nbLevel;
    }

    public void setNbLevel() {
        do {
            System.out.println("Niveau du personnage ?");
            nbLevel = sc.nextInt();
        } while (!(nbLevel > 0 && nbLevel <= 100));
    }

    /**public void setNbVitality(int nbVitality) {
        this.nbVitality = nbVitality;
    }

    public void setNbStrength(int nbStrength) {
        this.nbStrength = nbStrength;
    }

    public void setNbAgility(int nbAgility) {
        this.nbAgility = nbAgility;
    }

    public void setNbIntelligence(int nbIntelligence) {
        this.nbIntelligence = nbIntelligence;
    }

    public int getNbLevel() {
        return nbLevel;
    }
     */

}
