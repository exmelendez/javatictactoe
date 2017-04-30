package nyc.c4q.eddie;

public class LetterSetter {

    static int aiChooser;
    static String x = "X";
    static String o = "O";
    static String aiLetter;
    static String userLetter;

    //randomize number to be assign the AI a letter
    public static void aiLetterChooser() {

        aiChooser = (int) (Math.random() * 2 + 1);

        aiLetterAssigner(aiChooser);

    }

    //Method used to convert the AI's assigned number to it's letter
    public static void aiLetterAssigner(int n) {

        switch (n) {
            case 1:
                aiLetter = x;
                break;
            default:
                aiLetter = o;
                break;
        }

    }


    //If statment using AI's letter to assign the players letter
    public static void playerLetterAssigner() {

        if (aiLetter != "X") {
            userLetter = x;
        } else {
            userLetter = o;
        }

    }


}
