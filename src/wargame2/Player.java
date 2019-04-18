package wargame2;

//imports
import java.util.ArrayList;
import java.util.Arrays;

//player class
public class Player {

    //declaring the needed variables
    private GroupOfCards gc = new GroupOfCards();
    private ArrayList<Card> playerDeck = new ArrayList();
    private static ArrayList<Card> players = new ArrayList();
    private static ArrayList<Card> ai = new ArrayList();
    private static ArrayList<Card> saveEquals = new ArrayList();

    //Constructor 
    public Player() {
        System.out.println();
        SetCardGroups();
        //   ai.addAll(this.ai);
        //   players.addAll(this.players);
        //   System.out.println("INSIDE PLAYER: " + players.size());
        //   System.out.println("INSIDE PLAYER AI: " + ai.size());

    }

    //Fliping method that calls the compare method
    public static void Flip() {

        Compare();

    }

    //The method that split the cards to two halfs
    public void SetCardGroups() {

        playerDeck.addAll(Arrays.asList(gc.getCard()));

        for (int i = 0; i < 26; i++) {
            players.add(playerDeck.get(i));
        }

        for (int i = 0; i < 26; i++) {
            ai.add(playerDeck.get(i + 26));
        }

    }

    public static ArrayList<Card> getPlayers() {
        return players;
    }

    public static void setPlayers(ArrayList<Card> players) {
        Player.players = players;
    }

    public static ArrayList<Card> getAi() {
        return ai;
    }

    public static void setAi(ArrayList<Card> ai) {
        Player.ai = ai;
    }

    //the method that compare calls if the user lose
    public static void lostCard() {

        if (WinAndLose()) {
            System.out.println("You lost Cards!");
            System.out.println("Computer's Card: " + ai.get(0));
            System.out.println("Your Card: " + players.get(0) + "\n");

            ai.add(players.get(0));
            ai.add(ai.get(0));
            ai.remove(0);
            if (players.size() != 0) {
                players.remove(0);
            }

            System.out.println("Number Of cards you have: " + players.size());
            System.out.println("Number Of cards Computer has: " + ai.size());
//        System.out.println("after remove: " + ai.get(0));
//        System.out.println("after remove: " + players.get(0));
        }
    }

    //the method that compare calls if the user win
    public static void WinCard() {

        if (WinAndLose()) {
            System.out.println("You gain Cards!");
            System.out.println("Computer's Card: " + ai.get(0));
            System.out.println("Your Card: " + players.get(0) + "\n");
            players.add(ai.get(0));
            players.add(players.get(0));
            players.remove(0);
            if (ai.size() != 0) {
                ai.remove(0);
            }

            System.out.println("Number Of cards you have: " + players.size());
            System.out.println("Number Of cards Computer has: " + ai.size());

//        System.out.println("after remove: " + ai.get(0));
//        System.out.println("after remove: " + players.get(0));
        }
    }

    //the method that we use if the user lose the game
    public static void LostGame() {
        System.out.println("You lost the game! \n");
    }

    //the method that we use if the user win the game
    public static void WinGame() {
        System.out.println("You won the game! \n");
    }

    //the method that compare calls if the cards have equal numbers
    public static void EqualCard() {
        if (WinAndLose()) {
            while (Compare() == 2) {
                System.out.println("Computer's Card: " + ai.get(0));
                System.out.println("Your Card: " + players.get(0) + "\n");
                saveEquals.add(ai.get(0));
                saveEquals.add(players.get(0));
                ai.remove(0);
                players.remove(0);
                System.out.println("Number Of cards you have: " + players.size());
                System.out.println("Number Of cards Computer has: " + ai.size());
                System.out.println("Equal cards (Fliped again)");
                Flip();
            }
            for (int i = 0; i < saveEquals.size(); i++) {
                if (Compare() == 0) {
                    players.add(saveEquals.get(0));
                    saveEquals.remove(0);
                    System.out.println("you won the cards");
                    System.out.println("Computer's Card: " + ai.get(0));
                    System.out.println("Your Card: " + players.get(0) + "\n");
                }

                if (Compare() == 1) {
                    ai.add(saveEquals.get(0));
                    saveEquals.remove(0);
                    System.out.println("you lost the cards");
                    System.out.println("Computer's Card: " + ai.get(0));
                    System.out.println("Your Card: " + players.get(0) + "\n");
                }
            }
        }
    }

    //Compare method that findout the loser win, lose or draw the flip
    public static int Compare() {

        if (ai.get(0).cardNum < players.get(0).cardNum) {
            return 0;
        } else if (ai.get(0).cardNum > players.get(0).cardNum) {
            return 1;
        } else {
            return 2;
        }
    }

    //the method that check if the user wins or loses
    public static boolean WinAndLose() {
        if (players.isEmpty()) {
            LostGame();
            return false;
        }
        if (ai.isEmpty()) {
            WinGame();
            return false;
        }

        return true;
    }
}
