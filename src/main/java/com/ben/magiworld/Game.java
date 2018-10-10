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
                Character player1a = new Guerrier();
                player1a.Character();
                System.out.println("Woarg je suis le Guerrier Joueur 1 niveau " + player1a.nbLevel + " je possède " + player1a.nbVitality +
                        " de vitalité, " + player1a.nbStrength + " de force, " + player1a.nbAgility + " d'agilité, " + player1a.nbIntelligence + " d'intelligence !");
                break;
            case 2 :
                Character player1b = new Rôdeur();
                player1b.Character();
                System.out.println("Gnehehe je suis le Rôdeur Joueur 1 niveau " + player1b.nbLevel + " je possède " + player1b.nbVitality +
                        " de vitalité, " + player1b.nbStrength + " de force, " + player1b.nbAgility + " d'agilité, " + player1b.nbIntelligence + " d'intelligence !");
                break;
            case 3 :
                Character player1c = new Mage();
                player1c.Character();
                System.out.println("Abracadabra je suis le Mage Joueur 1 niveau " + player1c.nbLevel + " je possède " + player1c.nbVitality +
                        " de vitalité, " + player1c.nbStrength + " de force, " + player1c.nbAgility + " d'agilité, " + player1c.nbIntelligence + " d'intelligence !");
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


