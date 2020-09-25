package DopZadaniya.game2048;

import javax.sound.sampled.Line;
import java.util.Random;

public class GameField implements Game2048Field, Cloneable{
    private int size;
    private CellHolder[][] cells;
    private LineHolder[] verticalLines;
    private LineHolder[] horizontalLines;
    private Random random = new Random();

    public GameField(int size) throws Exception {
        if (size < 3) {
            throw new IllegalArgumentException("size must be 3 or greater");
        }
        this.size = size;
        cells = new CellHolder[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new CellHolder();
            }
        }
        verticalLines = new LineHolder[size];
        for (int i = 0; i < size; i++) {
            LineHolder currentHolder = new LineHolder(size);
            for (int j = 0; j < size; j++) {
                currentHolder.setHolder(j, cells[j][i]);
            }
            verticalLines[i] = currentHolder;
        }

        horizontalLines = new LineHolder[size];
        for (int i = 0; i < size; i++) {
            LineHolder currentHolder = new LineHolder(size);
            for (int j = 0; j < size; j++) {
                currentHolder.setHolder(j, cells[i][j]);
            }
            horizontalLines[i] = currentHolder;
        }

    }

    @Override
    public int getSize() {
        return size;
    }
    @Override
    public Cell[][] getFieldState() {
        Cell[][] cellsMatrix = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cellsMatrix[i][j] = cells[i][j].getCell();
            }
        }
        return cellsMatrix;
    }

    public void generateCell() {
        if (isFullFilled())
        {
            return;
        }
        boolean placed = false;
        int cellValue = (random.nextInt(2) + 1) * 2; // 2 or 4

        while (!placed) {
            int rightPosition = random.nextInt(size);
            int downPosition = random.nextInt(size);
            CellHolder targetHolder = cells[rightPosition][downPosition];
            if (targetHolder.isEmpty()) {
                targetHolder.setCell(new Cell(cellValue));
                placed = true;
            }
        }
    }

    @Override
    public int getMaxValue()
    {
        int maxValue = 0;
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(cells[i][j].getCell() != null)
                {
                    if(cells[i][j].getCell().getValue() > maxValue)
                        maxValue = cells[i][j].getCell().getValue();
                }
            }
        }
        return maxValue;
    }

    @Override
    public void moveRight() {
        move(horizontalLines, MoveDirection.RIGHT);
    }
    @Override
    public void moveDown() {
        move(verticalLines, MoveDirection.RIGHT);
    }
    @Override
    public void moveLeft() {
        move(horizontalLines, MoveDirection.LEFT);
    }
    @Override
    public void moveUp() {
        move(verticalLines, MoveDirection.LEFT);
    }

    private void move(LineHolder[] holders, MoveDirection direction) {
        boolean moved = false;
        for (LineHolder holder :
                holders) {
            switch (direction) {
                case LEFT:
                    moved |= holder.moveCellsLeft();
                    break;
                case RIGHT:
                    moved |= holder.moveCellsRight();
                    break;
            }
        }
        if (moved) {
            generateCell();
        }
    }
    @Override
    public boolean isMoveAvailable() {
        boolean moveAvailable = false;
        for (LineHolder holder: verticalLines) {
            moveAvailable |= holder.isMoveAvailable();
        }
        for (LineHolder holder: horizontalLines) {
            moveAvailable |= holder.isMoveAvailable();
        }
        return moveAvailable;
    }

    private boolean isFullFilled() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (cells[i][j].isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }



    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            builder.append('|');
            for (int j = 0; j < size; j++) {
                builder.append(cells[i][j]).append("|");
            }
            builder.append('\n');
            builder.append('\n');
        }
        return builder.toString();
    }
    private enum MoveDirection {
        LEFT,
        RIGHT
    }

    public GameField clone() throws CloneNotSupportedException {
        GameField newGameField = (GameField) super.clone();
        newGameField.cells = (CellHolder[][]) cells.clone();
        newGameField.horizontalLines = (LineHolder[]) horizontalLines.clone();
        return (GameField) newGameField;
    }

    public CellHolder[][] getCells() {
        return cells;
    }

    public void setCells(CellHolder[][] cells) {
        this.cells = cells;
    }

    public LineHolder[] getVerticalLines() {
        return verticalLines;
    }

    public LineHolder[] getHorizontalLines() {
        return horizontalLines;
    }

    public void setHorizontalLines(LineHolder[] horizontalLines) {
        this.horizontalLines = horizontalLines;
    }

    public Random getRandom() {
        return random;
    }

    public void setVerticalLines(LineHolder[] verticalLines) {
        this.verticalLines = verticalLines;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
