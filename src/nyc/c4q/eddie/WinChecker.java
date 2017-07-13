package nyc.c4q.eddie;

public class WinChecker {

    public static boolean winCheck(char player) {

        char[][] ttBoard = Board.getTtBoard();

        /* Row Win Check */
        for (int i = 1; i < 4; i++) {

            if (ttBoard[i][1] == player && ttBoard[i][2] == player && ttBoard[i][3] == player) {

                return true;
            }
        }

        /* Column Win Check */
        for (int i = 1; i < 4; i++) {

            if (ttBoard[1][i] == player && ttBoard[2][i] == player && ttBoard[3][i] == player) {

                return true;
            }
        }

        /* Diagonal down right win check */
        if (ttBoard[1][1] == player && ttBoard[2][2] == player && ttBoard[3][3] == player) {
            return true;
        }

        /* Diagnal down left win check */
        if (ttBoard[1][3] == player && ttBoard[2][2] == player && ttBoard[3][1] == player) {
            return true;
        }

        return false;
    }

}
