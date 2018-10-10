package com.ben.magiworld;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {
    private int nbPlayer;
    Scanner sc = new Scanner(System.in);

    public void initPlayers() {
        System.out.println("Création du personnage du joueur 1");
        nbPlayer = setNbPlayer();
        switch (nbPlayer) {
            case 1 :
                Character player1 = new Guerrier();
                player1.setNbLevel();
                System.out.println("Woarg je suis le Guerrier Joueur 1 niveau " + "player1.nbLevel" + "je possède " + "nbVitality" +
                        ", " + "nbStrenght" + "de force, " + "nbAgility" + "d'agilité, " + "nbIntelligence" + "d'intelligence !");
                break;
            case 2 :
                //Character player1 = new Rôdeur();
                // player1.caract();
                System.out.println("Gnehehe je suis le Rôdeur Joueur 1 niveau " + "nbLevel" + "je possède " + "nbVitality" +
                        ", " + "nbStrenght" + "de force, " + "nbAgility" + "d'agilité, " + "nbIntelligence" + "d'intelligence !");
                break;
            case 3 :
                //Character player1 = new Mage();
                // player1.charact();
                System.out.println("Abracadabra je suis le Mage Joueur 1 niveau " + "nbLevel" + "je possède " + "nbVitality" +
                        ", " + "nbStrenght" + "de force, " + "nbAgility" + "d'agilité, " + "nbIntelligence" + "d'intelligence !");
                break;
        }
    }

    public int setNbPlayer() {
        Map<String, Integer> characters = new HashMap<>();
        characters.put("Guerrier", 1);
        characters.put("Rôdeur", 2);
        characters.put("Mage", 3);
        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 Mage)");
            this.nbPlayer = sc.nextInt();
        } while (nbPlayer < 1 || nbPlayer > 3);
        return nbPlayer;
    }

    /**public void fight() {
    }*/

}


