package nyc.c4q.eddie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/**
 * Things I may use later
 * ignore section for now
 */
        /*inputting value in "C1" gave errors where the AI input did not display (blank) 3 out of 5 times*/
        /*inputting value in "C2" gave errors where the AI input did not display (blank) 4 out of 5 times*/
        /*inputting value in "C3" gave errors where the AI input did not display (blank) 2 out of 5 times*/

//        LetterSetter.aiLetterChooser();
//        LetterSetter.playerLetterAssigner();
//        SetPositionValue.positionSetter();
//        SetPositionValue.aiInput();
//        SetPositionValue.positionSetter();
//        SetPositionValue.aiInput();


//        SetPositionValue.positionSetter();

//        PositionMap.boardPrint();
//        SetPositionValue.placeUserInput();
//        PositionMap.boardPrint();
//        SetPositionValue.aiInput();
//        PositionMap.boardPrint();
//        SetPositionValue.placeUserInput();
//        PositionMap.boardPrint();
//        SetPositionValue.aiInput();
//        PositionMap.boardPrint();
//        SetPositionValue.placeUserInput();
//        PositionMap.boardPrint();
//        SetPositionValue.aiInput();
//        PositionMap.boardPrint();
//        System.out.println("AI=" + aiLetter);
//        System.out.println("User=" + userLetter);
//        WinOrLose.evaluate("X");

/**
 * The end of things not needed
 */
        gameEntry();
    }

    static void generalWelcomeMsg() {

        System.out.println("\n  * ~ WELCOME TO TIC TAC TOE ~ *  \n\nChoose your game mode: Type 1 for single player or 2 for two player...");
        System.out.print("> ");
    }

    static void gameEntry() {

        generalWelcomeMsg();

        Scanner sc = new Scanner(System.in);
        int numOfPlayers = sc.nextInt();

        while (numOfPlayers != 1 || numOfPlayers != 2) {

            if (numOfPlayers == 1 || numOfPlayers == 2) {
                sc.close();
                Game gameType = new Game(numOfPlayers);
                break;
            } else {
                System.out.println("NOT A VALID OPTION");
                System.out.print("> ");
                numOfPlayers = sc.nextInt();
            }
        }
    }

    //Extra/old stuff I may use later
    static void twoPlayerWelcome() {

        System.out.println("Since your turn is first, the system has randomly assigned the AI the letter of \"" + LetterSetter.aiLetter + "\".");
        System.out.println("\nYour letter is: " + LetterSetter.userLetter + "\nChoose the position to place your \"" + LetterSetter.userLetter + "\".\n");
        PositionMap.boardPrint();
    }

    static void singlePlayerWelcome() {

        System.out.println("Since your turn is first, the system has randomly assigned the AI the letter of \"" + LetterSetter.aiLetter + "\".");
        System.out.println("\nYour letter is: " + LetterSetter.userLetter + "\nChoose the position to place your \"" + LetterSetter.userLetter + "\".\n");
        PositionMap.boardPrint();
    }
}