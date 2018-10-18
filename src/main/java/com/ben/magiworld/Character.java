package com.ben.magiworld;

import java.util.Scanner;

public class Character {
    Scanner sc = new Scanner(System.in);
    protected int nbLevel;
    protected int nbVitality;
    protected int nbStrength;
    protected int nbAgility;
    protected int nbIntelligence;
    protected int nbBDamage;
    protected int nbSDamage;
    private String basicName;
    private String specialName;
    private String effect;


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
        return " niveau " + getNbLevel() + " je possède " + getNbVitality() + " de vitalité, " + getNbStrength() +
                " de force, " + getNbAgility() + " d'agilité, " + getNbIntelligence() + " d'intelligence !";
    }

    public int basicAttack() {return nbBDamage;}

    public String basicAttackName() {return basicName;}

    public int specialAttack() {return nbSDamage;}

    public String specialEffect() {return " perd " + nbSDamage + " points de vie.";}

    public String specialAttackName() {return specialName;}
}
