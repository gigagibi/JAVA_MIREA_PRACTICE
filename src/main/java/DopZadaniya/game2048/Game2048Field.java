package DopZadaniya.game2048;
public interface Game2048Field {
    int getSize();

    Cell[][] getFieldState();

    int getMaxValue();

    void moveRight();

    void moveDown();

    void moveLeft();

    void moveUp();

    boolean isMoveAvailable();


}
