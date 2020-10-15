package DopZadaniya.game2048MT;
import DopZadaniya.game2048MT.players.*;

public class Main {

    public static void main(String[] args) throws Exception {

        GameField gameField = new GameField(4);
        gameField.generateCell();
        Good2048Player player = new Good2048Player(gameField);
        player.startGame();

    }
}
