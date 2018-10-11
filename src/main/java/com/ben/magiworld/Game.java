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
            i++;
            System.out.println("Création du personnage du joueur "+ i);
            nbPlayer = setNbPlayer();
            switch (nbPlayer)  {
                case 1:
                    Character playerA = new Guerrier();
                    playerA.Character();
                    System.out.println("Woarg je suis le Guerrier Joueur "+ i +" niveau " + playerA.nbLevel + " je possède " + playerA.nbVitality +
                            " de vitalité, " + playerA.nbStrength + " de force, " + playerA.nbAgility + " d'agilité, " + playerA.nbIntelligence + " d'intelligence !");
                    players.add(playerA);
                    break;
                case 2:
                    Character playerB = new Rôdeur();
                    playerB.Character();
                    System.out.println("Gnehehe je suis le Rôdeur Joueur "+ i + " niveau " + playerB.nbLevel + " je possède " + playerB.nbVitality +
                            " de vitalité, " + playerB.nbStrength + " de force, " + playerB.nbAgility + " d'agilité, " + playerB.nbIntelligence + " d'intelligence !");
                    players.add(playerB);
                    break;
                case 3:
                    Character playerC = new Mage();
                    playerC.Character();
                    System.out.println("Abracadabra je suis le Mage Joueur " + i + " niveau " + playerC.nbLevel + " je possède " + playerC.nbVitality +
                            " de vitalité, " + playerC.nbStrength + " de force, " + playerC.nbAgility + " d'agilité, " + playerC.nbIntelligence + " d'intelligence !");
                    players.add(playerC);
                    break;
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
   /** public void fight() {
        Object joueur1;
        players.get(0) = joueur1;
        int nbAttack;
        do {
            if (players.get(1).getNbVitality() > 0) {
                System.out.println("Joueur 1 (" + players.get(0).getNbVitality() + ") veuillez choisir votre action (1 :" +
                        " Attaque Basique, 2 : Attaque Spéciale)");
                do {
                    nbAttack = sc.nextInt();
                }while (nbAttack < 1 || nbAttack > 2);
                switch (nbAttack) {
                    case 1 :
                        character.basicAttack();
                        players.get(1).getNbVitality = players.get(1).getNbVitality - nbDamage;
                        System.out.println("Joueur 1 utilise " + nomducouuuuup + "et inflige " + nbDamage + " dommages.");
                        System.out.println("Joueur 2 perd" + nbDamage + "points de vie");
                        break;
                    case 2 :
                        character.basicAttack();
                        players.get(1).getNbVitality =
                        System.out.println("Joueur 1 utilise " + nomducouuuuup + "et inflige " + nbDamage + " dommages.");
                        System.out.println("Joueur 2 perd" + nbDamage + "points de vie");
                        break;
                }
            } else {
                System.out.println("Joueur 2 est mort");
                System.out.println("Joueur 2 a perdu !");
            }
            if (joueur1.getNbVitalite() > 0) {
                System.out.println("Joueur 2 (" + joueur1.getNbVitalite() + ") veuillez choisir votre action (1 :" +
                        " Attaque Basique, 2 : Attaque Spéciale)");
                Attack();
                System.out.println("Joueur 2 utilise " + nomducouuuuup + "et inflige " + nombrededommages + " dommages.");
                System.out.println("Joueur 1 perd" + nombrededommages + "points de vie");
                joueur2.getNbVitalite() = joueur2.getNbVitalite() - nombrededommages;
            } else {
                System.out.println("Joueur 1 est mort");
                System.out.println("Joueur 1 a perdu !");
            }
        } while (joueur1.getNbVitalite() != 0 || joueur2.getNbVitalite != 0 );
    }*/
    
}


