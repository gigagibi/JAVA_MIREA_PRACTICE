package DopZadaniya.game2048;

public abstract class Game2048Player {
    protected Game2048Field game2048Field;

    public Game2048Player(Game2048Field game2048Field){
        this.game2048Field = game2048Field;
    }

    public void startGame() throws InterruptedException , Exception{
        while (game2048Field.isMoveAvailable()) {
            System.out.println(game2048Field);
            step();
            //Thread.sleep(300);
        }
        System.out.println("GAME OVER");
        System.out.println(game2048Field);
    }

    public void startGameOnMind() throws InterruptedException , Exception{
        while (game2048Field.isMoveAvailable()) {
            step();
        }
        //System.out.println("GAME OVER");
        //System.out.println(game2048Field);
    }

    protected abstract void step() throws InterruptedException, Exception;
}
