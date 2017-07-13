package nyc.c4q.eddie;

public class Game {

    char player1, player2;
    char currentPlayer;

    public Game(boolean isMultiPlayer) {

        if (isMultiPlayer == false) {
            currentPlayer = 'X';
            onePlayer();
        } else {
            twoPlayer();
        }
git sta
    }

    public static void onePlayer() {
        System.out.println("\n1 player msg\n");
        System.out.println(WinChecker.winCheck('X'));

    }

    public static void twoPlayer() {
        System.out.println("\n2 player Mode: Coming Soon!");
    }
}
