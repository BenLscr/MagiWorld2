package com.ben.magiworld;

public class Rôdeur extends Character {

    public Rôdeur() {
        super();
    }

    @Override
    public String toString() {
        return  "Gnehehe je suis le Rôdeur" + super.toString();
    }

    /**
     * Make equal damage in the agility of the player on the opponent.
     * @return damage deal
     */
    @Override
    public int basicAttack() {
        nbBDamage = getNbAgility();
        return nbBDamage;
    }

    @Override
    public String basicAttackName() {
        return "Tir à l'arc et inflige " + nbBDamage + " dommages.";
    }

    /**
     *The player wins his level divided by 2 in agility.
     * @return agility add
     */
    @Override
    public int specialAttack() {
        nbSDamage = 0;
        nbAgility = getNbAgility() + (getNbLevel() / 2);
        return nbSDamage;
    }

    @Override
    public String specialAttackName() {
        return " Concentration et gagne " + getNbLevel() / 2 + " en agilité.";
    }
}
