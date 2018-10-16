package com.ben.magiworld;

import java.util.Scanner;

public class Character {
    protected int nbLevel;
    protected int nbVitality;
    protected int nbStrength;
    protected int nbAgility;
    protected int nbIntelligence;
    protected int nbDamage;
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
        //essayer d'ajouter un i puisque que l'on a le droit d'ecrire avant un return si la méthode n'est pas un constructeur :)
        return " niveau " + getNbLevel() + " je possède " + getNbVitality() +
                " de vitalité, " + getNbStrength() + " de force, " + getNbAgility() + " d'agilité, " + getNbIntelligence() + " d'intelligence !";
    }

    public int basicAttack() {return nbDamage;}

    public void specialAttack() {}
}
