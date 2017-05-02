package nyc.c4q.eddie;

public class Game {

//    int numOfPlayers;
    boolean isMultiPlayer;

    public Game(boolean multiPlayer) {

        this.isMultiPlayer = multiPlayer;

    }

    public boolean getMultiPlayer() {
        return isMultiPlayer;
    }
}
