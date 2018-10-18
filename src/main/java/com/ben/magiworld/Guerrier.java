package com.ben.magiworld;

public class Guerrier extends Character {

    public Guerrier() {
        super();
    }

    @Override
    public String toString() {
        return  "Woarg je suis le Guerrier" + super.toString();
    }

    /**
     * Make equal damage in the strength of the player on the opponent.
     */
    @Override
    public int basicAttack() {
        nbBDamage = getNbStrength();
        return nbBDamage;
    }

    @Override
    public String basicAttackName() {
        return "Coup d'épée et inflige " + nbBDamage + " dommages.";
    }

    /**
     * Make equal damage in the strength of the player time two on the opponent.
     * The launching player the attack loses of the vitality: the value of its strength divided by 2.
     * @return damage deal
     */
    @Override
    public int specialAttack() {
        nbSDamage = getNbStrength() * 2;
        nbVitality = getNbVitality() - (getNbStrength() / 2);
        return nbSDamage;
    }

    @Override
    public String specialEffect() {
        return super.specialEffect() + "\nJoueur 1 perd " + getNbStrength()/2 + " points de vie";
    }

    @Override
    public String specialAttackName() {
        return "Coup de rage et inflige " + nbSDamage + " dommages.";
    }
}
