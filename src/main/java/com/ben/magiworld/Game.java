package com.ben.magiworld;

import java.util.*;
import java.util.List;

public class Game {
    private int nbPlayer;
    List<Object> players = new ArrayList<>();  //save instances of players
    Scanner sc = new Scanner(System.in);

    /**
     * Defined the players and their characteristics
     */
    public void initPlayers() {
        int i = 0;
        do {
            Character player = null;
            i++;
            System.out.println("Création du personnage du joueur "+ i);
            nbPlayer = setNbPlayer();
            switch (nbPlayer)  {
                case 1:
                    player = new Guerrier();
                    break;
                case 2:
                    player = new Rôdeur();
                    break;
                case 3:
                    player = new Mage();
                    break;
            }
            if (player != null) {
                System.out.println(player);
                players.add(player);
            }
        } while (players.size() != 2);
    }

    /**
     * Ask a question to choose a class
     * @return return the choice
     */
    public int setNbPlayer() {
        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 Mage)");
            this.nbPlayer = sc.nextInt();
        } while (nbPlayer < 1 || nbPlayer > 3);
        return nbPlayer;
    }


    /**
     * Progress of the fight. Players play while nobody is dead.
     */
   public void fight() {
        Character joueur1 = (Character) players.get(0);
        Character joueur2 = (Character) players.get(1);
        int nbAttack;
        do {
            if (joueur1.getNbVitality() > 0) {
                System.out.println("Joueur 1 (" + joueur1.getNbVitality() + ") veuillez choisir votre action (1 :" +
                        " Attaque Basique, 2 : Attaque Spéciale)");
                do {
                    nbAttack = sc.nextInt();
                }while (nbAttack < 1 || nbAttack > 2);
                switch (nbAttack) {
                    case 1 :
                        joueur2.nbVitality = joueur2.getNbVitality() - joueur1.basicAttack();
                        System.out.println("Joueur 1 utilise " + joueur1.basicAttackName());
                        System.out.println("Joueur 2 perd " + joueur1.basicAttack() + " points de vie");
                        break;
                    case 2 :
                        joueur2.nbVitality = joueur2.getNbVitality() - joueur1.specialAttack();
                        System.out.println("Joueur 1 utilise " + joueur1.specialAttackName());
                        System.out.println("Joueur 2" + joueur1.specialEffect());
                        break;
                }
            } else {
                System.out.println("Joueur 1 est mort");
                System.out.println("Joueur 1 a perdu !");
                break;
            }
            if (joueur2.getNbVitality() > 0) {
                System.out.println("Joueur 2 (" + joueur2.getNbVitality() + ") veuillez choisir votre action (1 :" +
                        " Attaque Basique, 2 : Attaque Spéciale)");
                do {
                    nbAttack = sc.nextInt();
                } while (nbAttack < 1 || nbAttack > 2);
                switch (nbAttack) {
                    case 1 :
                        joueur1.nbVitality = joueur1.getNbVitality() - joueur2.basicAttack();
                        System.out.println("Joueur 2 utilise " + joueur2.basicAttackName());
                        System.out.println("Joueur 1 perd " + joueur2.basicAttack() + " points de vie");
                        break;
                    case 2 :
                        joueur1.nbVitality = joueur1.getNbVitality() - joueur2.specialAttack();
                        System.out.println("Joueur 2 utilise " + joueur2.specialAttackName());
                        System.out.println("Joueur 1" + joueur2.specialEffect());
                        break;
                }
            } else {
                System.out.println("Joueur 2 est mort");
                System.out.println("Joueur 2 a perdu !");
                break;
            }
        } while (joueur1.getNbVitality() != 0 || joueur2.getNbVitality() != 0);
    }
}