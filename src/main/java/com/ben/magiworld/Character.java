package com.ben.magiworld;

import java.util.Scanner;

public class Character {
    private int nbLevel;
    private int nbVitality;
    private int nbStrength;
    private int nbAgility;
    private int nbIntelligence;
    Scanner sc = new Scanner(System.in);

    public Character() {
        askNbLevel();
        askNbStrength();
        askNbAgility();
        askNbIntelligence();
    }

    private void askNbLevel() {
        do {
            System.out.println("Niveau du personnage ?");
            setNbLevel(sc.nextInt());
        } while (!(nbLevel > 0 && nbLevel <= 100));
    }

    public void askNbStrength() {
        do {
            System.out.println("Force du personnage ?");
            setNbStrength(sc.nextInt());
        } while (nbStrength > nbLevel);
    }

    public void askNbAgility() {
        do {
            System.out.println("Agilité du personnage ?");
            setNbAgility(sc.nextInt());
        } while (!(nbAgility <= nbLevel - nbStrength));
    }

    public void askNbIntelligence() {
        do {
            System.out.println("Intelligence du personnage ?");
            setNbIntelligence(sc.nextInt());
        } while (nbIntelligence != nbLevel - (nbStrength + nbAgility));
    }

    public int getNbLevel() {
        return nbLevel;
    }

    public void setNbLevel(int nbLevel) {
        this.nbLevel = nbLevel;
        nbVitality = nbLevel * 5;
    }

    public int getNbStrength() {
        return nbStrength;
    }

    public void setNbStrength(int nbStrength) {
        this.nbStrength = nbStrength;
    }

    public int getNbAgility() {
        return nbAgility;
    }

    public void setNbAgility(int nbAgility) {
        this.nbAgility = nbAgility;
    }

    public int getNbIntelligence() {
        return nbIntelligence;
    }

    public void setNbIntelligence(int nbIntelligence) {
        this.nbIntelligence = nbIntelligence;
    }

    public int getNbVitality() {
        return nbVitality;
    }

    @Override
    public String toString() {
        return " niveau " + getNbLevel() + " je possède " + getNbVitality() +
                " de vitalité, " + getNbStrength() + " de force, " + getNbAgility() + " d'agilité, " + getNbIntelligence() + " d'intelligence !";
    }

    public int basicAttack() {return basicAttack();}

    public int specialAttack() {return specialAttack();}
}
