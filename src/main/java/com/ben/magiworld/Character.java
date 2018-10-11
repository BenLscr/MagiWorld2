package com.ben.magiworld;

import java.util.Scanner;

public class Character {
    protected int nbLevel;
    protected int nbVitality;
    protected int nbStrength;
    protected int nbAgility;
    protected int nbIntelligence;
    Scanner sc = new Scanner(System.in);

    public void Character() {
        setNbLevel();
        setNbVitality();
        setNbStrength();
        setNbAgility();
        setNbIntelligence();
    }

    public void setNbLevel() {
        do {
            System.out.println("Niveau du personnage ?");
            nbLevel = sc.nextInt();
        } while (!(nbLevel > 0 && nbLevel <= 100));
    }

    public void setNbVitality() {
        nbVitality = nbLevel * 5;
    }

    public void setNbStrength() {
        do {
            System.out.println("Force du personnage ?");
            nbStrength = sc.nextInt();
        } while (nbStrength > nbLevel);
    }

    public void setNbAgility() {
        do {
            System.out.println("Agilité du personnage ?");
            nbAgility = sc.nextInt();
        } while (!(nbAgility <= nbLevel - nbStrength));
    }

    public void setNbIntelligence() {
        do {
            System.out.println("Intelligence du personnage ?");
            nbIntelligence = sc.nextInt();
        } while (nbIntelligence != nbLevel - (nbStrength + nbAgility));
    }

    public int getNbVitality() {
        return nbVitality;
    }

    public int basicAttack() {return basicAttack();}

    public int specialAttack() {return specialAttack();}
}
