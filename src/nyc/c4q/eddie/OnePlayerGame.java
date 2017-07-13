package nyc.c4q.eddie;

public class OnePlayerGame {

    Character playersLetters, aiLetter;

    public void gameSetup() {

    }

    public Character letterSetter() {

        int aiChooser = (int) (Math.random() * 2 + 1);

        if (aiChooser == 1) {
            aiLetter = 'X';
        } else {
            aiLetter = 'O';
        }

        return null;
    }

    void gameDifficulty(){}

//    @Override
//    boolean gameWon() {
//        return super.gameWon();
//    }
//
//    @Override
//    void someshit() {
//        super.someshit();
//    }
}
