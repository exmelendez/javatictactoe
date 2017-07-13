package nyc.c4q.eddie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Game ticTacToe = new Game(gameSetup());

    }

    static boolean gameSetup() {

        System.out.println("\n  * ~ WELCOME TO TIC TAC TOE ~ *  \n\nChoose your game mode: Type 1 for single player or 2 for two player...");
        System.out.print("> ");

        boolean isMultiplePlayer = false;

        Scanner sc = new Scanner(System.in);
        int numOfPlayers = sc.nextInt();

        // TODO: Bug when user inputs string char instead of int
        while (numOfPlayers != 1 && numOfPlayers != 2) {

            System.out.println("NOT A VALID OPTION");
            System.out.print("> ");
            numOfPlayers = sc.nextInt();

            if (numOfPlayers == 1 || numOfPlayers == 2) {
                break;
            }
        }

        if (numOfPlayers == 2) {
            isMultiplePlayer = true;
        }

        sc.close();
        return isMultiplePlayer;
    }

    static void generalWelcomeMsg() {

        System.out.println("\n  * ~ WELCOME TO TIC TAC TOE ~ *  \n\nChoose your game mode: Type 1 for single player or 2 for two player...");
        System.out.print("> ");
    }

    //Extra/old stuff I may use later
    static void twoPlayerWelcome() {

        System.out.println("Since your turn is first, the system has randomly assigned the AI the letter of \"" + LetterSetter.aiLetter + "\".");
        System.out.println("\nYour letter is: " + LetterSetter.userLetter + "\nChoose the position to place your \"" + LetterSetter.userLetter + "\".\n");
//        Board.boardPrint();
    }

    static void singlePlayerWelcome() {

        System.out.println("Since your turn is first, the system has randomly assigned the AI the letter of \"" + LetterSetter.aiLetter + "\".");
        System.out.println("\nYour letter is: " + LetterSetter.userLetter + "\nChoose the position to place your \"" + LetterSetter.userLetter + "\".\n");
//        Board.boardPrint();
    }

}