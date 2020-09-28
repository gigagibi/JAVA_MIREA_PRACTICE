package DopZadaniya.game2048;
import DopZadaniya.game2048.players.*;

public class Main {

    public static void main(String[] args) throws Exception {

        GameField gameField = new GameField(100);
        gameField.generateCell();
        Good2048Player player = new Good2048Player(gameField);
        player.startGame();

    }
}
