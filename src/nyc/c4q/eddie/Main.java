package nyc.c4q.eddie;

public class Main {


    public static void main(String[] args) {

        /*inputting value in "C1" gave errors where the AI input did not display (blank) 3 out of 5 times*/
        /*inputting value in "C2" gave errors where the AI input did not display (blank) 4 out of 5 times*/
        /*inputting value in "C3" gave errors where the AI input did not display (blank) 2 out of 5 times*/

        LetterSetter.aiLetterChooser();
        LetterSetter.playerLetterAssigner();
        welcomeText();
        SetPositionValue.positionSetter();
        SetPositionValue.aiInput();
        SetPositionValue.positionSetter();
        SetPositionValue.aiInput();
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


    }

    static void welcomeText() {

        System.out.println("  * ~ WELCOME TO TIC TAC TOE ~ *  \n");
        System.out.println("Since your turn is first, the system has randomly assigned the AI the letter of \"" + LetterSetter.aiLetter + "\".");
        System.out.println("\nYour letter is: " + LetterSetter.userLetter + "\nChoose the position to place your \"" + LetterSetter.userLetter + "\".\n");
        PositionMap.boardPrint();
    }

    static void playGame() {

    }

}