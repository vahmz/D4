package wargame2;

//imports
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    //Main method
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //"check" make sures that we check if requirments are vaild.
        boolean check = false;
        String play = "";

        //Welcome Interface
        System.out.println("Welcome to the War game!! \n\n");
        System.out.println("Enter yes to Start the game:\n");

        //Asking user to join the game
        Player p = new Player();
        play = in.nextLine();

        //check the users answer
        if (play.equalsIgnoreCase("yes")) {
            check = true;
        } else if (!play.equalsIgnoreCase("yes")) {
            check = false;
        }
        while (check == true) {

            if (play.equalsIgnoreCase("exit")
                    || Player.getPlayers().size() == 0
                    || Player.getAi().size() == 0) {
                check = false;
                break;
            }

            //Asking the user if they want to continue 
            System.out.println("=====================================================");
            System.out.println("Enter Any Button to play, or 'exit' to End");
            play = in.nextLine();

            // 0 means we won the card
            if (Player.Compare() == 0) {
                Player.WinAndLose();
                Player.WinCard();

            } // 1 means we lost the card
            else if (Player.Compare() == 1) {
                Player.WinAndLose();
                Player.lostCard();

            } // 2 means cards are equal  
            else if (Player.Compare() == 2) {
                Player.WinAndLose();
                Player.EqualCard();
            } else if (check = false) {
                break;
            }
        }
        while (check);
        System.out.println("=====================================================");
        if (Player.getAi().isEmpty()) {
            System.out.println("Congratulations, You Won!");
        } else {
            System.out.println("You Lost! Better Luck Next Time :)");
        }
        System.out.println("Thank You For Playing!");
    }
}
