package com.ben.magiworld;

import java.util.*;
import java.util.List;

public class Game {
    private int nbPlayer;
    private Character character;
    private Guerrier Guerrier;
    private Mage mage;
    private Rôdeur rodeur;
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


    /**
     * Progress of the fight. Players play while nobody is dead.
     */
   public void fight() {
        Character joueur1 = (Character) players.get(0);
        Character joueur2 = (Character) players.get(1);
        int nbAttack;
        do {
            if (joueur2.getNbVitality() > 0) {
                System.out.println("Joueur 1 (" + joueur1.getNbVitality() + ") veuillez choisir votre action (1 :" +
                        " Attaque Basique, 2 : Attaque Spéciale)");
                do {
                    nbAttack = sc.nextInt();
                }while (nbAttack < 1 || nbAttack > 2);
                switch (nbAttack) {
                    case 1 :
                        joueur2.nbVitality = joueur2.getNbVitality() - joueur1.basicAttack();
                        System.out.println("Joueur 1 utilise Coup d'épée et inflige " + joueur1.basicAttack() + " dommages.");
                        System.out.println("Joueur 2 perd " + joueur1.basicAttack() + " points de vie");
                        System.out.println("Vie du joueur 2 " + joueur2.getNbVitality());
                        break;
                    case 2 :
                        joueur1.specialAttack();
                        break;
                }
            } else {
                System.out.println("Joueur 2 est mort");
                System.out.println("Joueur 2 a perdu !");
            }
            /**if (players.get(0).getNbVitality() > 0) {
                System.out.println("Joueur 2 (" + players.get(0).getNbVitality() + ") veuillez choisir votre action (1 :" +
                        " Attaque Basique, 2 : Attaque Spéciale)");
                System.out.println("Joueur 2 utilise " + nomducouuuuup + "et inflige " + nombrededommages + " dommages.");
                System.out.println("Joueur 1 perd" + nombrededommages + "points de vie");
                players.get(1).getNbVitality() = players.get(1).getNbVitality() - nombrededommages;
            } else {
                System.out.println("Joueur 1 est mort");
                System.out.println("Joueur 1 a perdu !");
            }*/
        } while (joueur1.getNbVitality() != 0 || joueur2.getNbVitality() != 0);
    }
}