package com.ben.magiworld;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {
    private int nbPlayer;
    Scanner sc = new Scanner(System.in);

    public void initPlayer1() {
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

    public void initPlayer2() {
        System.out.println("Création du personnage du joueur 2");
        nbPlayer = setNbPlayer();
        switch (nbPlayer) {
            case 1 :
                Character player2a = new Guerrier();
                player2a.Character();
                System.out.println("Woarg je suis le Guerrier Joueur 2 niveau " + player2a.nbLevel + " je possède " + player2a.nbVitality +
                        " de vitalité, " + player2a.nbStrength + " de force, " + player2a.nbAgility + " d'agilité, " + player2a.nbIntelligence + " d'intelligence !");
                break;
            case 2 :
                Character player2b = new Rôdeur();
                player2b.Character();
                System.out.println("Gnehehe je suis le Rôdeur Joueur 2 niveau " + player2b.nbLevel + " je possède " + player2b.nbVitality +
                        " de vitalité, " + player2b.nbStrength + " de force, " + player2b.nbAgility + " d'agilité, " + player2b.nbIntelligence + " d'intelligence !");
                break;
            case 3 :
                Character player2c = new Mage();
                player2c.Character();
                System.out.println("Abracadabra je suis le Mage Joueur 2 niveau " + player2c.nbLevel + " je possède " + player2c.nbVitality +
                        " de vitalité, " + player2c.nbStrength + " de force, " + player2c.nbAgility + " d'agilité, " + player2c.nbIntelligence + " d'intelligence !");
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


