package a03;

import java.util.Scanner;

/**
 * This is a turn-based games requires a sum calculation of the points obtained
 * by each player to determine who wins the game.
 *
 * @author Rakhuzhuwo Sapruna (A00455075)
 */
public class GameRecorder {

    public static final int maxScore = 1000;

    public static void main(String[] args) {
        //declaring variable
        Scanner kbd = new Scanner(System.in);
        int rounds, num = 1;
        int player1Score = 0, player2Score = 0;

        //Intro to the program
        System.out.println("\nWelcome to Game Recorder!\n"
                + "---------------------------------------\n"
                + "by Rakhuzhuwo Sapruna (A00455075)");

        //Asking the user for rounds
        System.out.print("\nHow many rounds will each player play? ");
        rounds = kbd.nextInt();
        for (int i = 1; i <= rounds; i++) {
            int player1, player2;
            System.out.print("\nRound " + num + ":");
            System.out.print("\nEnter the scores for Player1 and Player2: ");
            player1 = kbd.nextInt();
            player2 = kbd.nextInt();
            kbd.nextLine();
            //checking if the scores are valid
            boolean checkPlayer1 = (player1 <= 0 || player1 >= maxScore);
            boolean checkPlayer2 = (player2 <= 0 || player2 >= maxScore);
            while (checkPlayer1 || checkPlayer2) {
                System.out.println("Scores must be non-negative numbers "
                        + "less than or equal to 1000");
                System.out.print("Enter the scores for Player1 and "
                        + "Player2: ");
                player1 = kbd.nextInt();
                player2 = kbd.nextInt();
                checkPlayer1 = (player1 < 0 || player1 > maxScore);
                checkPlayer2 = (player2 < 0 || player2 > maxScore);
            }//end while
            //check who won the round
            if (player1 > player2) {
                System.out.println("***** Player 1 wins " + "round " + num
                        + " *****");
                player1Score++;
            }//end if
            else if (player1 < player2) {
                System.out.println("***** Player 2 wins " + "round " + num
                        + " *****");
                player2Score++;
            }//end else-if
            else {
                System.out.println("***** Round " + num + " is a draw *****");
            }//end else
            num++;
        }//end for

        //asking the user to press enter for the result
        System.out.print("\nPress Enter to see the results ....");
        kbd.nextLine();
        //print the final score
        printFinalScore(player1Score, player2Score);
    }
    //printing the final score
/**
 * 
 * @param player1Score
 * @param player2Score 
 */
    public static void printFinalScore(int player1Score, int player2Score) {
        System.out.println("\n\nThe final score is:\n"
                + "Player 1: " + player1Score + "\n"
                + "Player 2: " + player2Score);
    }
}
