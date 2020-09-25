package DopZadaniya.game2048;
import DopZadaniya.game2048.players.*;

public class Main {
    private GameField gameField, gameField1;

    public GameField getGameField() {
        return gameField;
    }

    public void setGameField(GameField gameField) {
        this.gameField = gameField;
    }

    public GameField getGameField1() {
        return gameField1;
    }

    public void setGameField1(GameField gameField1) {
        this.gameField1 = gameField1;
    }

    public static void main(String[] args) throws Exception {
       // for(int i = 0; i < 4; i++)
       // {
       // int maxV=0;
        GameField gameField = new GameField(4);
       // while(maxV < 2048)
       // {
            gameField = new GameField(4);
            gameField.generateCell();
            Good2048Player player = new Good2048Player(gameField);
            //Random2048Player player = new Random2048Player(gameField);
            //player.startGame();
            player.startGame();
            //if(gameField.getMaxValue() > maxV)
              //  maxV = gameField.getMaxValue();
       // }
       // System.out.println(gameField);
        //System.out.println(gameField.getMaxValue());
        //}


        /*GameField g1 = new GameField(4);
        GameField g2 = new GameField(4);
        equate(g1, g2);
        g1.generateCell();
        System.out.println(g2);*/
    }
}
