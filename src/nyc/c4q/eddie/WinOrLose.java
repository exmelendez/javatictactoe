package nyc.c4q.eddie;

public class WinOrLose {

    public static void evaluate(String input) {

        if (PositionMap.pValue.get("A1") == input && PositionMap.pValue.get("A2") == input
                    && PositionMap.pValue.get("A3") == input) {

                if (input == LetterSetter.userLetter) {
                    System.out.println("Congratulations You Won!");
                } else {
                    System.out.println("Sorry you lost!");
                }
            }

            if (PositionMap.pValue.get("B1") == input && PositionMap.pValue.get("B2") == input
                    && PositionMap.pValue.get("B3") == input) {

                if (input == LetterSetter.userLetter) {
                    System.out.println("Congratulations You Won!");
                } else {
                    System.out.println("Sorry you lost!");
                }
            }

            if (PositionMap.pValue.get("C1") == input && PositionMap.pValue.get("C2") == input
                    && PositionMap.pValue.get("C3") == input) {

                if (input == LetterSetter.userLetter) {
                    System.out.println("Congratulations You Won!");
                } else {
                    System.out.println("Sorry you lost!");
                }
            }

            if (PositionMap.pValue.get("A1") == input && PositionMap.pValue.get("B1") == input
                    && PositionMap.pValue.get("C1") == input) {

                if (input == LetterSetter.userLetter) {
                    System.out.println("Congratulations You Won!");
                } else {
                    System.out.println("Sorry you lost!");
                }
            }

            if (PositionMap.pValue.get("A2") == input && PositionMap.pValue.get("B2") == input
                    && PositionMap.pValue.get("C2") == input) {

                if (input == LetterSetter.userLetter) {
                    System.out.println("Congratulations You Won!");
                } else {
                    System.out.println("Sorry you lost!");
                }
            }

            if (PositionMap.pValue.get("A3") == input && PositionMap.pValue.get("B3") == input
                    && PositionMap.pValue.get("C3") == input) {

                if (input == LetterSetter.userLetter) {
                    System.out.println("Congratulations You Won!");
                } else {
                    System.out.println("Sorry you lost!");
                }
            }

            if (PositionMap.pValue.get("A1") == input && PositionMap.pValue.get("B2") == input
                    && PositionMap.pValue.get("C3") == input) {

                if (input == LetterSetter.userLetter) {
                    System.out.println("Congratulations You Won!");
                } else {
                    System.out.println("Sorry you lost!");
                }
            }

            if (PositionMap.pValue.get("A3") == input && PositionMap.pValue.get("B2") == input
                    && PositionMap.pValue.get("C1") == input) {

                if (input == LetterSetter.userLetter) {
                    System.out.println("Congratulations You Won!");
                } else {
                    System.out.println("Sorry you lost!");
                }
            }

    }

    /*
    if input = A1, A2, A3
    if input = B1, B2, B3
    if input = C1, C2, C3
    if input = A1, B1, C1
    if input = A2, B2, C2
    if input = A3, B3, C3
    if input = A1, B2, C3
    if input = C1, B2, A3
     */

}
