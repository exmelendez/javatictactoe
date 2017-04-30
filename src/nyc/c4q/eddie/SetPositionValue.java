package nyc.c4q.eddie;

import java.util.Scanner;

public class SetPositionValue {

    static Scanner scanner = new Scanner(System.in);

    //Will use a scanner to retrieve users position and then
    // run it in the method that will take that value and place it in the hashmap.
    public static void positionSetter() {

        System.out.println("Choose where to play your " + LetterSetter.userLetter + "\n>");
        String userInput = scanner.next();
        placeUserInput(userInput);
    }

    public static void aiInput() {

        System.out.println("AI's Turn:");

        while (PositionMap.pValue.get("A1") == null || PositionMap.pValue.get("A2") == null
                || PositionMap.pValue.get("A3") == null || PositionMap.pValue.get("B1") == null
                || PositionMap.pValue.get("B2") == null || PositionMap.pValue.get("B3") == null
                || PositionMap.pValue.get("C1") == null || PositionMap.pValue.get("C2") == null
                || PositionMap.pValue.get("C3") == null) {

            int assigner = (int) (Math.random() * 9 + 1);

            for (int i = 0; i < PositionMap.rows.length; i++)
                for (String key : PositionMap.pValue.keySet()) {
                    if (assigner == i && PositionMap.pValue.get(key) == null)
                        PositionMap.pValue.put(key, LetterSetter.aiLetter);
                    i++;
//                    break;
                }

//            if (assigner == 1 && PositionMap.pValue.get("A1") == null) {
//                PositionMap.pValue.put("A1", LetterSetter.aiLetter);
//                break;
//            }
//
//
//            if (assigner == 2 && PositionMap.pValue.get("B1") == null) {
//                PositionMap.pValue.put("B1", LetterSetter.aiLetter);
//                break;
//            }
//
//
//            if (assigner == 3 && PositionMap.pValue.get("C1") == null) {
//                PositionMap.pValue.put("C1", LetterSetter.aiLetter);
//                break;
//            }
//
//            if (assigner == 4 && PositionMap.pValue.get("A2") == null) {
//                PositionMap.pValue.put("A2", LetterSetter.aiLetter);
//                break;
//            }
//
//
//            if (assigner == 5 && PositionMap.pValue.get("B2") == null) {
//                PositionMap.pValue.put("B2", LetterSetter.aiLetter);
//                break;
//            }
//
//
//            if (assigner == 6 && PositionMap.pValue.get("C2") == null) {
//                PositionMap.pValue.put("C2", LetterSetter.aiLetter);
//                break;
//            }
//            if (assigner == 7 && PositionMap.pValue.get("A3") == null) {
//                PositionMap.pValue.put("A3", LetterSetter.aiLetter);
//                break;
//            }
//
//
//            if (assigner == 8 && PositionMap.pValue.get("B3") == null) {
//                PositionMap.pValue.put("B3", LetterSetter.aiLetter);
//                break;
//            }
//
//
//            if (assigner == 9 && PositionMap.pValue.get("C3") == null) {
//                PositionMap.pValue.put("C3", LetterSetter.aiLetter);
//                break;
//            }
            break;
        }

        PositionMap.boardPrint();

    }

    public static void placeUserInput(String input) {

        /* New, condensed working code */
        for (String key : PositionMap.pValue.keySet()) {
            if (input.equalsIgnoreCase(key))
                PositionMap.pValue.put(key, LetterSetter.userLetter);
        }


        /* Old working code */
//            if (input.equalsIgnoreCase("A1")) {
//            PositionMap.pValue.put("A1", LetterSetter.userLetter);
//        }
//
//        if (input.equalsIgnoreCase("B1")) {
//            PositionMap.pValue.put("B1", LetterSetter.userLetter);
//        }
//
//        if (input.equalsIgnoreCase("C1")) {
//            PositionMap.pValue.put("C1", LetterSetter.userLetter);
//        }
//
//        if (input.equalsIgnoreCase("A2")) {
//            PositionMap.pValue.put("A2", LetterSetter.userLetter);
//        }
//
//        if (input.equalsIgnoreCase("B2")) {
//            PositionMap.pValue.put("B2", LetterSetter.userLetter);
//        }
//
//        if (input.equalsIgnoreCase("C2")) {
//            PositionMap.pValue.put("C2", LetterSetter.userLetter);
//        }
//
//        if (input.equalsIgnoreCase("A3")) {
//            PositionMap.pValue.put("A3", LetterSetter.userLetter);
//        }
//
//        if (input.equalsIgnoreCase("B3")) {
//            PositionMap.pValue.put("B3", LetterSetter.userLetter);
//        }
//
//        if (input.equalsIgnoreCase("C3")) {
//            PositionMap.pValue.put("C3", LetterSetter.userLetter);
//        }

        PositionMap.boardPrint();

    }

}
