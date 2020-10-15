package DopZadaniya.game2048MT;
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
