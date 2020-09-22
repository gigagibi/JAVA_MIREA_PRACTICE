package game2048;

import game2048.players.*;

public class Main {
    public static void main(String[] args) throws Exception {
        GameField gameField = new GameField(4);
        gameField.generateCell();
        Game2048Player player = new TasherPlayer2048(gameField);
        player.startGame();
    }
}
