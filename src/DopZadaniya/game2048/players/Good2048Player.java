package DopZadaniya.game2048.players;

import DopZadaniya.game2048.*;

import java.util.Random;

import static java.lang.Double.max;

public class Good2048Player extends Game2048Player {
    private GameField game2048Field2;
    private Random2048Player randomPlayer;

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

    @Override
    protected void step() throws InterruptedException, Exception {
        double RScore = 0, LScore = 0, UScore = 0, DScore = 0, max = 0, MaxGenScore = 0, RGenScore = 0, LGenScore = 0, UGenScore = 0 , DGenScore = 0;
        game2048Field2 = new GameField(this.game2048Field.getSize());
        equate(game2048Field2, (GameField)game2048Field);
        for (int j = 0; j < 4; j++) {
            max = 0; MaxGenScore = 0;
            randomPlayer = new Random2048Player(game2048Field2);
            int count = 0;
            switch (j) {
                case 0:
                    game2048Field2.moveRight();
                    count = 0;
                    if(game2048Field.getMaxValue() < 2048)
                    {
                        count  = 500;
                    }
                    else
                    {
                        count = 5000;
                    }
                    for (int i = 0; i < count; i++) {
                        randomPlayer.startGameOnMind();
                        //max += (double)(game2048Field2.getMaxValue());
                        for(int a = 0; a < game2048Field.getSize(); a++)
                        {
                            for(int b = 0; b < game2048Field.getSize(); b++)
                            {
                                if(game2048Field2.getCells()[a][b].getCell() != null)
                                MaxGenScore += (double)game2048Field2.getCells()[a][b].getCell().getValue();
                            }
                        }

                        //game2048Field2 = (GameField) game2048Field;
                        game2048Field2 = new GameField(this.game2048Field.getSize());
                        equate(game2048Field2, (GameField)game2048Field);
                        randomPlayer = new Random2048Player(game2048Field2);
                        game2048Field2.moveRight();
                    }

                    break;
                case 1:
                    game2048Field2.moveLeft();
                    count = 0;
                    if(game2048Field.getMaxValue() < 2048)
                    {
                        count  = 500;
                    }
                    else
                    {
                        count = 5000;
                    }
                    for (int i = 0; i < count; i++) {
                        randomPlayer.startGameOnMind();
                       // max += (double)(game2048Field2.getMaxValue());
                        for(int a = 0; a < game2048Field.getSize(); a++)
                        {
                            for(int b = 0; b < game2048Field.getSize(); b++)
                            {
                                if(game2048Field2.getCells()[a][b].getCell() != null)
                                    MaxGenScore += (double)game2048Field2.getCells()[a][b].getCell().getValue();
                            }
                        }
                        //game2048Field2 = (GameField) game2048Field;
                        game2048Field2 = new GameField(this.game2048Field.getSize());
                        equate(game2048Field2, (GameField)game2048Field);
                        randomPlayer = new Random2048Player(game2048Field2);
                        game2048Field2.moveLeft();
                    }
                    break;
                case 2:
                    game2048Field2.moveUp();
                    count = 0;
                    if(game2048Field.getMaxValue() < 2048)
                    {
                        count  = 500;
                    }
                    else
                    {
                        count = 5000;
                    }
                    for (int i = 0; i < count; i++) {
                        randomPlayer.startGameOnMind();
                        //max += (double)(game2048Field2.getMaxValue());
                        for(int a = 0; a < game2048Field.getSize(); a++)
                        {
                            for(int b = 0; b < game2048Field.getSize(); b++)
                            {
                                if(game2048Field2.getCells()[a][b].getCell() != null)
                                    MaxGenScore += (double)game2048Field2.getCells()[a][b].getCell().getValue();
                            }
                        }
                        //game2048Field2 = (GameField) game2048Field;
                        game2048Field2 = new GameField(this.game2048Field.getSize());
                        equate(game2048Field2, (GameField)game2048Field);
                        randomPlayer = new Random2048Player(game2048Field2);
                        game2048Field2.moveUp();
                    }
                    break;
                case 3:
                    game2048Field2.moveDown();
                    count = 0;
                    if(game2048Field.getMaxValue() < 2048)
                    {
                        count  = 500;
                    }
                    else
                    {
                        count = 5000;
                    }
                    for (int i = 0; i < count; i++) {
                        randomPlayer.startGameOnMind();
                        //max += (double)(game2048Field2.getMaxValue());
                        for(int a = 0; a < game2048Field.getSize(); a++)
                        {
                            for(int b = 0; b < game2048Field.getSize(); b++)
                            {
                                if(game2048Field2.getCells()[a][b].getCell() != null)
                                    MaxGenScore += (double)game2048Field2.getCells()[a][b].getCell().getValue();
                            }
                        }
                        //game2048Field2 = (GameField) game2048Field;
                        game2048Field2 = new GameField(this.game2048Field.getSize());
                        equate(game2048Field2, (GameField)game2048Field);
                        randomPlayer = new Random2048Player(game2048Field2);
                        game2048Field2.moveDown();
                    }
                    break;
            }

            switch (j) {
                case 0:
                    RGenScore = MaxGenScore;
                    break;
                case 1:
                    LGenScore = MaxGenScore;
                    break;
                case 2:
                    UGenScore = MaxGenScore;
                    break;
                case 3:
                    DGenScore = MaxGenScore;
                    break;
            }
            game2048Field2 = new GameField(this.game2048Field.getSize());
            equate(game2048Field2, (GameField)game2048Field);
        }
        /*if(RScore == DScore && RScore == LScore && RScore == UScore)
        {
            Random r = new Random();
            switch(r.nextInt(4))
            {
                case 0:
                    game2048Field.moveRight();
                    break;
                case 1:
                    game2048Field.moveLeft();
                    break;
                case 2:
                    game2048Field.moveUp();
                    break;
                case 3:
                    game2048Field.moveDown();
                    break;
            }
        }*/
        if (max(RGenScore, max(LGenScore, max(UGenScore, DGenScore))) == RGenScore) {
            game2048Field.moveRight();
           // lastKnownScore = DScore;
        } else if (max(RGenScore, max(LGenScore, max(UGenScore, DGenScore))) == LGenScore) {
            game2048Field.moveLeft();
           // lastKnownScore = LScore;
        } else if (max(RGenScore, max(LGenScore, max(UGenScore, DGenScore))) == UGenScore) {
            game2048Field.moveUp();
           // lastKnownScore = UScore;
        } else if (max(RGenScore, max(LGenScore, max(UGenScore, DGenScore))) == DGenScore) {
            game2048Field.moveDown();
           // lastKnownScore = DScore;
        }
    }
}
