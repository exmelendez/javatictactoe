package nyc.c4q.eddie;

public class Board {

    private static char[][] ttBoard = {

            {' ', 'A', 'B', 'C'},
            {'1', '-', '-', '-'},
            {'2', '-', '-', '-'},
            {'3', '-', '-', '-'}
    };

    public static char[][] getTtBoard() {
        return ttBoard;
    }

    public static boolean positionNullCheck(String playPosition) {


        if (playPosition.equals("A1") && ttBoard[1][1] == '-') {
            return true;
        }

        if (playPosition.equals("B1") && ttBoard[1][2] == '-') {
            return true;
        }

        if (playPosition.equals("C1") && ttBoard[1][3] == '-') {
            return true;
        }

        if (playPosition.equals("A2") && ttBoard[2][1] == '-') {
            return true;
        }

        if (playPosition.equals("B2") && ttBoard[2][2] == '-') {
            return true;
        }

        if (playPosition.equals("C2") && ttBoard[2][3] == '-') {
            return true;
        }

        if (playPosition.equals("A3") && ttBoard[3][1] == '-') {
            return true;
        }

        if (playPosition.equals("B3") && ttBoard[3][2] == '-') {
            return true;
        }

        if (playPosition.equals("C3") && ttBoard[3][3] == '-') {
            return true;
        }

        return false;
    }

    public static char[][] setPosition(char player, String playPosition) {

        switch (playPosition) {
            case "A1":
                ttBoard[1][1] = player;
                break;
            case "A2":
                ttBoard[1][2] = player;
                break;
            case "A3":
                ttBoard[1][3] = player;
                break;
            case "B1":
                ttBoard[2][1] = player;
                break;
            case "B2":
                ttBoard[2][2] = player;
                break;
            case "B3":
                ttBoard[2][3] = player;
                break;
            case "C1":
                ttBoard[3][1] = player;
                break;
            case "C2":
                ttBoard[3][2] = player;
                break;
            case "C3":
                ttBoard[3][3] = player;
                break;
        }

        return ttBoard;
    }

    public static void printCurrentBoard(char[][] ticTacArray) {
        for (char[] row : ticTacArray) {

            for (char j : row) {
                System.out.print(j + " ");
            }

            System.out.println("");
        }
    }

    public static void resetBoard() {

        for (int i = 1; i < 4; i++) {

            for (int j = 1; j < 4; j++) {
                ttBoard[i][j] = '-';
            }
        }
    }
}
