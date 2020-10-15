package DopZadaniya.game2048MT.players;


import DopZadaniya.game2048MT.*;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Double.max;

public class Good2048Player extends Game2048Player {


    private static GameField[] gameFieldsT = new GameField[4];
    private static Random2048Player[] randomPlayersT = new Random2048Player[4];
    private static int[] MaxGenScoresT = new int[4];

    public Good2048Player(Game2048Field game2048Field) {
        super(game2048Field);
    }

    public static void equate(GameField g2, GameField g1)
    {
        for(int i = 0; i < g1.getSize(); i++)
        {
            for(int j = 0; j < g1.getSize(); j++)
            {
                if(g1.getCells()[i][j].getCell() != null)
                {
                    g2.getCells()[i][j].setCell(new Cell(0));
                    g2.getCells()[i][j].getCell().setValue(g1.getCells()[i][j].getCell().getValue());
                }
            }
        }
    }


    public static void playRandPlayerOnDir(GameField gf, int index) throws Exception
    {
        int size = gameFieldsT[index].getSize();

        switch(index)
        {
            case 0:
                gameFieldsT[index].moveRight();
                break;
            case 1:
                gameFieldsT[index].moveLeft();
                break;
            case 2:
                gameFieldsT[index].moveUp();
                break;
            case 3:
                gameFieldsT[index].moveDown();
                break;
        }

        for(int i = 0; i < 500; i++)
        {
            randomPlayersT[index].startGameOnMind();
            for(int a = 0; a < size; a++)
            {
                for(int b = 0; b < size; b++)
                {
                    MaxGenScoresT[index] += gameFieldsT[index].getCells()[a][b].getCell().getValue();
                }
            }
            gameFieldsT[index] = new GameField(gf.getSize());
            equate(gameFieldsT[index], gf);
            randomPlayersT[index] = new Random2048Player(gameFieldsT[index]);
            gameFieldsT[index].moveRight();

        }
    }



    @Override
    protected void step() throws InterruptedException, Exception {
        ArrayList<Thread> threads = new ArrayList<Thread>();


        for(int i = 0; i < 4; i++)
        {
            int localI = i;
            gameFieldsT[i] = new GameField(game2048Field.getSize());
            equate(gameFieldsT[i], (GameField)game2048Field);
            randomPlayersT[i] = new Random2048Player(gameFieldsT[0]);
            Thread thread = new Thread(() -> {
                try {
                    playRandPlayerOnDir((GameField)game2048Field, localI);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            thread.start();
            threads.add(thread);
        }

        for (Thread t : threads) {
            t.join();
        }

        if (max(MaxGenScoresT[0], max(MaxGenScoresT[1], max(MaxGenScoresT[2], MaxGenScoresT[3]))) == MaxGenScoresT[0]) {
            game2048Field.moveRight();
        } else if (max(MaxGenScoresT[0], max(MaxGenScoresT[1], max(MaxGenScoresT[2], MaxGenScoresT[3]))) == MaxGenScoresT[1]) {
            game2048Field.moveLeft();
        } else if (max(MaxGenScoresT[0], max(MaxGenScoresT[1], max(MaxGenScoresT[2], MaxGenScoresT[3]))) == MaxGenScoresT[2]) {
            game2048Field.moveUp();
        } else if (max(MaxGenScoresT[0], max(MaxGenScoresT[1], max(MaxGenScoresT[2], MaxGenScoresT[3]))) == MaxGenScoresT[3]) {
            game2048Field.moveDown();
        }
    }
}
