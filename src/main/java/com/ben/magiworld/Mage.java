package com.ben.magiworld;

public class Mage extends Character {

    public Mage() {
        super();
    }

    @Override
    public String toString() {
        return  "Abracadabra je suis le Mage" + super.toString();
    }

    /**
     * Make equal damage in the intelligence of the player on the opponent.
     * @return damage deal
     */
    @Override
    public int basicAttack() {
        nbBDamage = getNbIntelligence();
        return nbBDamage;
    }

    @Override
    public String basicAttackName() {
        return "Boule de feu et inflige " + nbBDamage + " dommages.";
    }

    /**
     *The player health his life and gets back to his quantity of intelligence time 2 in points of life.
     *Watch out, he cannot have more life than he had it at first.
     * @return viltality
     */
    @Override
    public int specialAttack() {
        nbSDamage = 0;
        nbVitality = getNbVitality() + (getNbIntelligence() * 2);
        if (nbVitality > nbLevel * 5) {
            nbVitality = nbLevel * 5;
        }
        return nbSDamage;
    }

    @Override
    public String specialAttackName() {
        return "Soin et gagne " + getNbIntelligence()*2 + " en vitalité.";
    }
}
