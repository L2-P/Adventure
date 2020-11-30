
/**
 * Write a description of class rockpaperscizers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class rockpaperscizers
{    public static void main(String[] args) {
    Random r = new Random();
    int gameCount = 0;
    int computerWins = 0;
    int playerWins = 0;
    int rock, paper, scissors;
    rock = 1;
    paper = 2;
    scissors = 3;
    int playerChoice = 0;
    int computerChoice;

    System.out.println("Welcome to Rock Paper Scissors! Best 2 out of 3!");

    //While the game count is less than 3, the loop will repeat
    while (gameCount < 3) {
        computerChoice = r.nextInt(3) + 1;
        System.out.println("Enter \"Rock\", \"Paper\", or \"Scissors\"");
        String USER_Input = userInput.next();
        if (USER_Input.equalsIgnoreCase("Rock")) {
            playerChoice = 1;
        }
        if (USER_Input.equalsIgnoreCase("Paper")) {
            playerChoice = 2;
        }
        if (USER_Input.equalsIgnoreCase("Scissors")) {
            playerChoice = 3;
        }
        //If player enters anything besides rock, paper, or scissors
        if (playerChoice <= 0 || playerChoice > 3) {
            System.out.println("That wasn't an option");
            computerWins++;
            gameCount++;
            System.out.println("Not a valid input! Computer Wins!\n" +
                    "Player has won " +playerWins + " times and the computer " +
                    "has won " + computerWins + " times");

            //The game goes on, and the winners are added up!
        } else if (playerChoice == 1 && computerChoice == 2) {
            computerWins++;
            gameCount++;
            System.out.println("Rock v Paper! Computer Wins!\n" +
                    "Player has won " + playerWins + " times and the computer " +
                    "has won " + computerWins + " times");
        } else if (playerChoice == 2 && computerChoice == 1) {
            playerWins++;
            gameCount++;
            System.out.println("Paper v Rock! Player Wins!\n" +
                    "Player has won " + playerWins + " times and the computer " +
                    "has won " + computerWins + " times");
        } else if (playerChoice == 2 && computerChoice == 3) {
            computerWins++;
            gameCount++;
            System.out.println("Paper v Scissors! Computer Wins!\n" +
                    "Player has won " + playerWins + " times and the computer " +
                    "has won " + computerWins + " times");
        } else if (playerChoice == 3 && computerChoice == 2) {
            playerWins++;
            gameCount++;
            System.out.println("Scissors v Paper! Player Wins!\n" +
                    "Player has won " + playerWins + " times and the computer " +
                    "has won " + computerWins + " times");
        } else if (playerChoice == 3 && computerChoice == 1) {
            computerWins++;
            gameCount++;
            System.out.println("Scissors v Rock! Computer Wins!\n" +
                    "Player has won " + playerWins + " times and the computer " +
                    "has won " + computerWins + " times");
        } else if (playerChoice == 1 && computerChoice == 3) {
            playerWins++;
            gameCount++;
            System.out.println("Rock v Scissors! Player Wins!\n" +
                    "Player has won " + playerWins + " times and the computer " +
                    "has won " + computerWins + " times");
        } else if (playerChoice == 1 && computerChoice == 1) {
            gameCount++;
            System.out.println("Rock v Rock! Tie!\n" +
                    "Player has won " + playerWins + " times and the computer " +
                    "has won " + computerWins + " times");
        } else if (playerChoice == 2 && computerChoice == 2) {
            gameCount++;
            System.out.println("Paper v Paper! Tie!\n" +
                    "Player has won " + playerWins + " times and the computer " +
                    "has won " + computerWins + " times");
        } else if (playerChoice == 3 && computerChoice == 3) {
            gameCount++;
            System.out.println("Paper v Paper! Tie!\n" +
                    "Player has won " + playerWins + " times and the computer " +
                    "has won " + computerWins + " times");
        }

        if (gameCount == 3 && computerWins > playerWins || computerWins == 2) {
            System.out.println("The Computer Wins!");
            break;
        } else if (gameCount == 3 && computerWins < playerWins || playerWins ==2) {
            System.out.println("The Player Wins!");
        } else if (gameCount == 3 && computerWins == playerWins) {
            System.out.println("The game is a tie!");
        }
    }
}
}