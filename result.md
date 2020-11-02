### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\Change.java
```java



        Scanner sc = new Scanner(System.in);
        int change = sc.nextInt();
        while (change >= 0) {
            change -= 5;
        System.out.println("Всего " + howManyWays + " способов");
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048\Cell.java
```java

    private int value;
        this.value = value;
    public int getValue() {
    }
    public void setValue(int value) {
    }
    public Cell multiply() {
    }
    public Cell clone() throws CloneNotSupportedException {
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048\CellHolder.java
```java
public class CellHolder  implements Cloneable{

        return cell == null;

        Cell localCell = cell;
        return localCell;

        return cell;

        this.cell = cell;
    @Override
        if (cell == null) {
        }
        if (value < 10) {
        } else if (value < 100) {
        } else if (value < 1000) {
        } else return "" + value;

        CellHolder newCellHolder = (CellHolder) super.clone();
        return (CellHolder) newCellHolder;
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048\Game2048Field.java
```java
public interface Game2048Field {








}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048\Game2048Player.java
```java

    protected Game2048Field game2048Field;
    public Game2048Player(Game2048Field game2048Field){
    }
    public void startGame() throws InterruptedException , Exception{
            System.out.println(game2048Field);
            //Thread.sleep(300);
        System.out.println("GAME OVER");
    }
    public void startGameOnMind() throws InterruptedException , Exception{
            step();
        //System.out.println("GAME OVER");
    }
    protected abstract void step() throws InterruptedException, Exception;
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048\GameField.java
```java

import java.util.Random;
public class GameField implements Game2048Field, Cloneable{
    private CellHolder[][] cells;
    private LineHolder[] horizontalLines;

        if (size < 3) {
        }
        cells = new CellHolder[size][size];
            for (int j = 0; j < size; j++) {
            }
        verticalLines = new LineHolder[size];
            LineHolder currentHolder = new LineHolder(size);
                currentHolder.setHolder(j, cells[j][i]);
            verticalLines[i] = currentHolder;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
            }
        }
    }
    @Override
        return size;
    @Override
        Cell[][] cellsMatrix = new Cell[size][size];
            for (int j = 0; j < size; j++) {
            }
        return cellsMatrix;

        if (isFullFilled())
            return;
        boolean placed = false;

            int rightPosition = random.nextInt(size);
            CellHolder targetHolder = cells[rightPosition][downPosition];
                targetHolder.setCell(new Cell(cellValue));
            }
    }
    @Override
    {
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++)
                if(cells[i][j].getCell() != null)
                    if(cells[i][j].getCell().getValue() > maxValue)
                }
        }
    }
    @Override
        move(horizontalLines, MoveDirection.RIGHT);
    @Override
        move(verticalLines, MoveDirection.RIGHT);
    @Override
        move(horizontalLines, MoveDirection.LEFT);
    @Override
        move(verticalLines, MoveDirection.LEFT);

        boolean moved = false;
                holders) {
                case LEFT:
                    break;
                    moved |= holder.moveCellsRight();
            }
        if (moved) {
        }
    @Override
        boolean moveAvailable = false;
            moveAvailable |= holder.isMoveAvailable();
        for (LineHolder holder: horizontalLines) {
        }
    }
    private boolean isFullFilled() {
            for (int j = 0; j < size; j++) {
                    return false;
            }
        return true;


    public String toString() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
            }
            builder.append('\n');
        return builder.toString();
    private enum MoveDirection {
        RIGHT

        GameField newGameField = (GameField) super.clone();
        newGameField.horizontalLines = (LineHolder[]) horizontalLines.clone();
    }
    public CellHolder[][] getCells() {
    }
    public void setCells(CellHolder[][] cells) {
    }
    public LineHolder[] getVerticalLines() {
    }
    public LineHolder[] getHorizontalLines() {
    }
    public void setHorizontalLines(LineHolder[] horizontalLines) {
    }
    public Random getRandom() {
    }
    public void setVerticalLines(LineHolder[] verticalLines) {
    }
    public void setSize(int size) {
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048\LineHolder.java
```java


    private CellHolder[] cellsLine;
    public LineHolder(int size) {
    }
    public void setHolder(int position, CellHolder holder) {
    }
    public boolean moveCellsLeft() {
        for (int i = 0; i < cellsLine.length - 1; i++) {
        }
    }
    public boolean moveCellsRight() {
        for (int i = cellsLine.length - 1; i > 0; i--) {
        }
    }
    public boolean isMoveAvailable() {

            if (currentCell.isEmpty()) {
            }
            if (!nearCell.isEmpty() && currentCell.getCell().getValue() == nearCell.getCell().getValue()) {
            }
        return false;

        CellHolder to = cellsLine[cellIndex];
        if (to.isEmpty()) { // move
                CellHolder from = cellsLine[i];
                    to.setCell(from.popCell());
                    break;
            }
        if (!to.isEmpty()) {
            for (int i = cellIndex + step; i < cellsLine.length && i >= 0; i += step) { // sum
                if (!from.isEmpty())
                    if (toValue == from.getCell().getValue())
                        to.setCell(from.popCell().multiply());
                    }
                }
        }
    }
    @Override
        return "LineHolder{" +
                '}';

        LineHolder newLineHolder = (LineHolder) super.clone();
        return newLineHolder;
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048\Main.java
```java
import DopZadaniya.game2048.players.*;
public class Main {
    public static void main(String[] args) throws Exception {
        GameField gameField = new GameField(4);
        Good2048Player player = new Good2048Player(gameField);

}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048\players\Console2048Player.java
```java

import DopZadaniya.game2048.Game2048Player;
import java.util.Scanner;
public class Console2048Player extends Game2048Player implements Cloneable{

        super(game2048Field);
    }
    @Override
        String line = scanner.nextLine();
            case "w":
                break;
                game2048Field.moveRight();
            case "s":
                break;
                game2048Field.moveLeft();
        }
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048\players\Good2048Player.java
```java




    private GameField game2048Field2;

        super(game2048Field);

    {
        for(int i = 0; i < g1.getSize(); i++)
            for(int j = 0; j < g1.getSize(); j++)
                if(g1.getCells()[i][j].getCell() != null)
                    g2.getCells()[i][j].setCell(new Cell(0));
                }
            }
    }
    @Override
        double RScore = 0, LScore = 0, UScore = 0, DScore = 0, max = 0, MaxGenScore = 0, RGenScore = 0, LGenScore = 0, UGenScore = 0 , DGenScore = 0;
        equate(game2048Field2, (GameField)game2048Field);
            max = 0; MaxGenScore = 0;
            int count = 0;
                case 0:
                    count = 0;
                    {
                    }
                    {
                    }
                        randomPlayer.startGameOnMind();
                        for(int a = 0; a < game2048Field.getSize(); a++)
                            for(int b = 0; b < game2048Field.getSize(); b++)
                                if(game2048Field2.getCells()[a][b].getCell() != null)
                            }

                        game2048Field2 = new GameField(this.game2048Field.getSize());
                        randomPlayer = new Random2048Player(game2048Field2);
                    }
                    break;
                    game2048Field2.moveLeft();
                    if(game2048Field.getMaxValue() < 2048)
                        count  = 500;
                    else
                        count = 5000;
                    for (int i = 0; i < count; i++) {
                       // max += (double)(game2048Field2.getMaxValue());
                        {
                            {
                                    MaxGenScore += (double)game2048Field2.getCells()[a][b].getCell().getValue();
                        }
                        game2048Field2 = new GameField(this.game2048Field.getSize());
                        randomPlayer = new Random2048Player(game2048Field2);
                    }
                case 2:
                    count = 0;
                    {
                    }
                    {
                    }
                        randomPlayer.startGameOnMind();
                        for(int a = 0; a < game2048Field.getSize(); a++)
                            for(int b = 0; b < game2048Field.getSize(); b++)
                                if(game2048Field2.getCells()[a][b].getCell() != null)
                            }
                        //game2048Field2 = (GameField) game2048Field;
                        equate(game2048Field2, (GameField)game2048Field);
                        game2048Field2.moveUp();
                    break;
                    game2048Field2.moveDown();
                    if(game2048Field.getMaxValue() < 2048)
                        count  = 500;
                    else
                        count = 5000;
                    for (int i = 0; i < count; i++) {
                        //max += (double)(game2048Field2.getMaxValue());
                        {
                            {
                                    MaxGenScore += (double)game2048Field2.getCells()[a][b].getCell().getValue();
                        }
                        game2048Field2 = new GameField(this.game2048Field.getSize());
                        randomPlayer = new Random2048Player(game2048Field2);
                    }
            }
            switch (j) {
                    RGenScore = MaxGenScore;
                case 1:
                    break;
                    UGenScore = MaxGenScore;
                case 3:
                    break;
            game2048Field2 = new GameField(this.game2048Field.getSize());
        }
        {
            switch(r.nextInt(4))
                case 0:
                    break;
                    game2048Field.moveLeft();
                case 2:
                    break;
                    game2048Field.moveDown();
            }
        if (max(RGenScore, max(LGenScore, max(UGenScore, DGenScore))) == RGenScore) {
           // lastKnownScore = DScore;
            game2048Field.moveLeft();
        } else if (max(RGenScore, max(LGenScore, max(UGenScore, DGenScore))) == UGenScore) {
           // lastKnownScore = UScore;
            game2048Field.moveDown();
        }
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048\players\Random2048Player.java
```java

import DopZadaniya.game2048.Game2048Player;
import java.util.Random;
public class Random2048Player extends Game2048Player implements Cloneable {
    public Random2048Player(Game2048Field game2048Field) {
    }
    @Override
        switch (random.nextInt(4)) {
                game2048Field.moveRight();
            case 1:
                break;
                game2048Field.moveLeft();
            case 3:
                break;
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048MT\Cell.java
```java

    private int value;
        this.value = value;
    public int getValue() {
    }
    public void setValue(int value) {
    }
    public Cell multiply() {
    }
    public Cell clone() throws CloneNotSupportedException {
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048MT\CellHolder.java
```java
public class CellHolder  implements Cloneable{

        return cell == null;

        Cell localCell = cell;
        return localCell;

        return cell;

        this.cell = cell;
    @Override
        if (cell == null) {
        }
        if (value < 10) {
        } else if (value < 100) {
        } else if (value < 1000) {
        } else return "" + value;

        CellHolder newCellHolder = (CellHolder) super.clone();
        return (CellHolder) newCellHolder;
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048MT\Game2048Field.java
```java
public interface Game2048Field {








}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048MT\Game2048Player.java
```java

    protected Game2048Field game2048Field;
    public Game2048Player(Game2048Field game2048Field){
    }
    public void startGame() throws InterruptedException , Exception{
            System.out.println(game2048Field);
            //Thread.sleep(300);
        System.out.println("GAME OVER");
    }
    public void startGameOnMind() throws InterruptedException , Exception{
            step();
        //System.out.println("GAME OVER");
    }
    protected abstract void step() throws InterruptedException, Exception;
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048MT\GameField.java
```java

import java.util.Random;
public class GameField implements Game2048Field, Cloneable{
    private CellHolder[][] cells;
    private LineHolder[] horizontalLines;

        if (size < 3) {
        }
        cells = new CellHolder[size][size];
            for (int j = 0; j < size; j++) {
            }
        verticalLines = new LineHolder[size];
            LineHolder currentHolder = new LineHolder(size);
                currentHolder.setHolder(j, cells[j][i]);
            verticalLines[i] = currentHolder;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
            }
        }
    }
    @Override
        return size;
    @Override
        Cell[][] cellsMatrix = new Cell[size][size];
            for (int j = 0; j < size; j++) {
            }
        return cellsMatrix;

        if (isFullFilled())
            return;
        boolean placed = false;

            int rightPosition = random.nextInt(size);
            CellHolder targetHolder = cells[rightPosition][downPosition];
                targetHolder.setCell(new Cell(cellValue));
            }
    }
    @Override
    {
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++)
                if(cells[i][j].getCell() != null)
                    if(cells[i][j].getCell().getValue() > maxValue)
                }
        }
    }
    @Override
        move(horizontalLines, MoveDirection.RIGHT);
    @Override
        move(verticalLines, MoveDirection.RIGHT);
    @Override
        move(horizontalLines, MoveDirection.LEFT);
    @Override
        move(verticalLines, MoveDirection.LEFT);

        boolean moved = false;
                holders) {
                case LEFT:
                    break;
                    moved |= holder.moveCellsRight();
            }
        if (moved) {
        }
    @Override
        boolean moveAvailable = false;
            moveAvailable |= holder.isMoveAvailable();
        for (LineHolder holder: horizontalLines) {
        }
    }
    private boolean isFullFilled() {
            for (int j = 0; j < size; j++) {
                    return false;
            }
        return true;


    public String toString() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
            }
            builder.append('\n');
        return builder.toString();
    private enum MoveDirection {
        RIGHT

        GameField newGameField = (GameField) super.clone();
        newGameField.horizontalLines = (LineHolder[]) horizontalLines.clone();
    }
    public CellHolder[][] getCells() {
    }
    public void setCells(CellHolder[][] cells) {
    }
    public LineHolder[] getVerticalLines() {
    }
    public LineHolder[] getHorizontalLines() {
    }
    public void setHorizontalLines(LineHolder[] horizontalLines) {
    }
    public Random getRandom() {
    }
    public void setVerticalLines(LineHolder[] verticalLines) {
    }
    public void setSize(int size) {
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048MT\LineHolder.java
```java


    private CellHolder[] cellsLine;
    public LineHolder(int size) {
    }
    public void setHolder(int position, CellHolder holder) {
    }
    public boolean moveCellsLeft() {
        for (int i = 0; i < cellsLine.length - 1; i++) {
        }
    }
    public boolean moveCellsRight() {
        for (int i = cellsLine.length - 1; i > 0; i--) {
        }
    }
    public boolean isMoveAvailable() {

            if (currentCell.isEmpty()) {
            }
            if (!nearCell.isEmpty() && currentCell.getCell().getValue() == nearCell.getCell().getValue()) {
            }
        return false;

        CellHolder to = cellsLine[cellIndex];
        if (to.isEmpty()) { // move
                CellHolder from = cellsLine[i];
                    to.setCell(from.popCell());
                    break;
            }
        if (!to.isEmpty()) {
            for (int i = cellIndex + step; i < cellsLine.length && i >= 0; i += step) { // sum
                if (!from.isEmpty())
                    if (toValue == from.getCell().getValue())
                        to.setCell(from.popCell().multiply());
                    }
                }
        }
    }
    @Override
        return "LineHolder{" +
                '}';

        LineHolder newLineHolder = (LineHolder) super.clone();
        return newLineHolder;
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048MT\Main.java
```java
import DopZadaniya.game2048MT.players.*;
public class Main {
    public static void main(String[] args) throws Exception {
        GameField gameField = new GameField(4);
        Good2048Player player = new Good2048Player(gameField);

}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048MT\players\Console2048Player.java
```java

import DopZadaniya.game2048MT.Game2048Player;
import java.util.Scanner;
public class Console2048Player extends Game2048Player implements Cloneable{

        super(game2048Field);
    }
    @Override
        String line = scanner.nextLine();
            case "w":
                break;
                game2048Field.moveRight();
            case "s":
                break;
                game2048Field.moveLeft();
        }
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048MT\players\Good2048Player.java
```java

import DopZadaniya.game2048MT.*;
import java.util.ArrayList;



    private static GameField[] gameFieldsT = new GameField[4];
    private static int[] MaxGenScoresT = new int[4];
    public Good2048Player(Game2048Field game2048Field) {
    }
    public static void equate(GameField g2, GameField g1)
        for(int i = 0; i < g1.getSize(); i++)
            for(int j = 0; j < g1.getSize(); j++)
                if(g1.getCells()[i][j].getCell() != null)
                    g2.getCells()[i][j].setCell(new Cell(0));
                }
        }

    public static void playRandPlayerOnDir(GameField gf, int index) throws Exception
        int size = gameFieldsT[index].getSize();
        switch(index)
            case 0:
                break;
                gameFieldsT[index].moveLeft();
            case 2:
                break;
                gameFieldsT[index].moveDown();
        }
        for(int i = 0; i < 500; i++)
            randomPlayersT[index].startGameOnMind();
            {
                {
                }
            gameFieldsT[index] = new GameField(gf.getSize());
            randomPlayersT[index] = new Random2048Player(gameFieldsT[index]);
            {
                    gameFieldsT[index].moveRight();
                case 1:
                    break;
                    gameFieldsT[index].moveUp();
                case 3:
                    break;
        }


    protected void step() throws InterruptedException, Exception {

        {
            gameFieldsT[i] = new GameField(game2048Field.getSize());
            randomPlayersT[i] = new Random2048Player(gameFieldsT[i]);
        }
        for(int i = 0; i < 4; i++)
            int localI = i;
                try {
                } catch (Exception e) {
                }
            threads[i].start();

            t.join();

            game2048Field.moveRight();
            game2048Field.moveLeft();
            game2048Field.moveUp();
            game2048Field.moveDown();
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\game2048MT\players\Random2048Player.java
```java

import DopZadaniya.game2048MT.Game2048Player;
import java.util.Random;
public class Random2048Player extends Game2048Player implements Cloneable {
    public Random2048Player(Game2048Field game2048Field) {
    }
    @Override
        switch (random.nextInt(4)) {
                game2048Field.moveRight();
            case 1:
                break;
                game2048Field.moveLeft();
            case 3:
                break;
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\DopZadaniya\Threads.java
```java

import java.util.concurrent.locks.ReentrantLock;
public class Threads {
    static int totalSum, sumCopy;
    static int[] threadSums = new int[4];
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            Thread thread = new Thread(() -> work(localI, localI));
            threads.add(thread);

            t.join();
        long endTime = System.currentTimeMillis();
        for(int i = 0; i < threadSums.length; i++)
        System.out.println("total sum: " + totalSum);

        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
    }
    private static long doHardWork(int start, int count, int index) {
        for (int i = 0; i < count; i++) {
            threadSums[index]++;
        //b = 0;
            Thread.sleep(100);
            e.printStackTrace();
        return a;
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA1\praktika1zadanie3\src\com\company\Main.java
```java


	// write your code here
        sum1 = 0; sum2 = 0; sum3 = 0; sc = 0;
        for(int i = 0; i < 5; i++)
            sum1 += arr[i];

        {
            sc++;

        do{
           sc++;

        System.out.println(sum2);
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA1\praktika1zadanie4\src\com\company\Main.java
```java


	for(String str : args)
        System.out.println(str);
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA1\praktika1zadanie5\src\com\company\Main.java
```java


	// write your code here\
        for(int i = 2; i < 11; i++)
            System.out.format("1 / %d%n", i);
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA1\praktika1zadanie6\src\com\company\Main.java
```java
import java.lang.Math;


	// write your code here
        System.out.println("Массив: ");
        {
            System.out.print(arr[i] + " ");
        Arrays.sort(arr);
        System.out.println("Сортированный массив: ");
        {
        }
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA1\praktika1zadanie7\src\com\company\Main.java
```java


    {
            return 1;
            return n * fac(n-1);
    public static void main(String[] args) {
        System.out.println(fac(5));
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA10\MainWindow.java
```java


import java.awt.*;
public class MainWindow extends JFrame {
    {
        JButton addButton = new JButton("+");
        JButton divButton = new JButton("/");

        operations.add(addButton);
        operations.add(divButton);
        operations.setLayout(fl);
        JTextField numA = new JTextField();
        JLabel result = new JLabel();

        add(operations);
        add(result);
        setSize(300, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addButton.addActionListener(action ->
            try
                result.setText(String.format("%.4f",Float.parseFloat(numA.getText()) + Float.parseFloat(numB.getText())));
            catch (Exception ex)
                result.setText(ex.getMessage());
        });
        subButton.addActionListener(action ->
            try
                result.setText(String.format("%.4f",Float.parseFloat(numA.getText()) - Float.parseFloat(numB.getText())));
            catch (Exception ex)
                result.setText(ex.getMessage());


        {
                result.setText(String.format("%.4f", Float.parseFloat(numA.getText()) / Float.parseFloat(numB.getText())));
            catch (Exception ex)
                result.setText(ex.getMessage());
        });
        mulButton.addActionListener(action ->
            try
                result.setText(String.format("%.4f", Float.parseFloat(numA.getText()) * Float.parseFloat(numB.getText())));
            catch (Exception ex)
                result.setText(ex.getMessage());
        });
        setVisible(true);

        MainWindow window = new MainWindow();
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA11\Threads.java
```java

import java.util.concurrent.atomic.AtomicInteger;

import java.util.concurrent.locks.ReentrantLock;
public class Threads {
    static int totalSum;
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Thread> threads = new ArrayList<>();
            final int localI = i;
            thread.start();

        }
        for (Thread t : threads) {
            System.out.println(t.getState());
        }
        System.out.println("total time: " + (endTime - startTime));
    }
    private static void work(int i) {
        long result = doHardWork(i * 1000, 100_000_000);
        System.out.println(i + ": " + result + " | " + (endTime-startTime));

        long a = 0;
        for (int i = 0; i < count; i++) {
            //totalSum++;
            //totalSum.incrementAndGet();
        lock.unlock();
    }
    private synchronized static void incTotalSum()
        totalSum++;
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA12\FontColors.java
```java

    ANSI_RESET("\u001B[0m"),
    ANSI_RED("\u001B[31m"),
    ANSI_YELLOW("\u001B[33m"),


        this.color = color;

        return color;

        this.color = color;
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA12\Main.java
```java

    public static void writeWithColor(FontColors fc, String str)
        System.out.println(fc.getColor() + str + FontColors.ANSI_RESET.getColor());
    public static void main(String[] args) {
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA13\BigCostException.java
```java

}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA13\Item.java
```java

    private int cost;
    public int getCost() {
    }
    public void setCost(int cost) throws NegativeCostException, BigCostException{
        {
        }
        {
        }

}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA13\Main.java
```java




        try{
            item.setCost(cost);
        }
            System.out.println("Cost is negative!");
        catch(NumberFormatException nfe) {
        }
        {
        }
        {
        }
            System.out.println(item);

    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA13\NegativeCostException.java
```java

}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA14\Main.java
```java

import java.util.HashMap;
import java.util.regex.Matcher;


    {
        StringBuilder sb = new StringBuilder();
        {
            if(i!= rules.size() -1)
        }
        HashMap<String, String> replaceMap = new HashMap<String, String>();
        {
        }
        Pattern pattern = Pattern.compile(sb.toString());

    }

    {
        String lineAns = line;
        ArrayList<String[]> replaceComponents = new ArrayList<String[]>();
        HashMap<String, String> replaceMap = new HashMap<String, String>();
        {
            replaceMap.put(t.split(" ")[0], t.split(" ")[1]);
        int size = line.length();
        while(e < size-1 && b < size-1)
            StringBuilder sb = new StringBuilder();
            {
                e++;
            if(e < line.length())
            else {
                e = ++b;
            if(replaceMap.get(sb.toString()) != null)
        }
        for(String t : replaced)
            sb.append(t);
        for(int i = b; i < line.length(); i++)
            sb.append(line.charAt(i));
        return sb.toString();

        Scanner sc = new Scanner(System.in);
        ArrayList<String> rules = new ArrayList<String>();

            throw new IllegalArgumentException("incorrect N. N must be like: 1 <= N <= 300");
        sc = new Scanner(System.in);
        {
            rules.add(rule);

        System.out.println("Without regex: " + replaceByRules(rules, str));
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA15\Main.java
```java

import java.util.HashMap;
import java.util.Scanner;
public class Main {
    {
        ptr = ptr.transitions.get(operationNumber);

    public static void main(String[] args) {

        HashMap<Integer, State> transitions = new HashMap<Integer, State>();
        commands.put(1, "add_library");
        s.setCommands(commands);

        commands.put(0, "test");
        s = new State();
        list.add(s);
        commands = new HashMap<Integer, String>();//3
        commands.put(1, "add_library");
        s.setCommands(commands);

        commands.put(0, "restart");
        s = new State();
        list.add(s);
        commands = new HashMap<Integer, String>();//5
        commands.put(1, "restart");
        s.setCommands(commands);
        ///////////////////////////////////////////////////////////////////
        transitions.put(1, list.get(4));

        transitions.put(0, list.get(2));//2
        list.get(1).setTransitions(transitions);
        transitions = new HashMap<Integer, State>();
        transitions.put(1, list.get(4));

        transitions.put(0, list.get(2));//4
        list.get(3).setTransitions(transitions);
        transitions = new HashMap<Integer, State>();
        transitions.put(1, list.get(2));


        int N = Integer.parseInt(sc.nextLine());
        while(N != -1)
            codes.add(N);
        }
        {
        }
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA15\State.java
```java



    HashMap<Integer, State> transitions = new HashMap<Integer, State>();
    public State(HashMap<Integer, String> commands, HashMap<Integer, State> transitions) {
        this.transitions = transitions;

    }
    public HashMap<Integer, String> getCommands() {
    }
    public void setCommands(HashMap<Integer, String> commands) {
    }
    public HashMap<Integer, State> getTransitions() {
    }
    public void setTransitions(HashMap<Integer, State> transitions) {
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA17\Main.java
```java

import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Paths;


    public static void searchInDir(String path) {

        {
            {
            }
        else if(file.isFile() && file.getPath().endsWith(".java"))
            try(BufferedReader reader = new BufferedReader(new FileReader(file.getPath())))
                result.append("### " + file.getPath() + "\n" + "```java" + "\n");
                while(reader.readLine()!= null)
                    result.append(reader.readLine() + "\n");
               result.append("```" + "\n");
                System.out.println("file not found");
            } catch (IOException e) {
            }
        }


        try(PrintWriter writer = new PrintWriter(new FileWriter("D:\\Projectss\\Java\\JAVA_MIREA_PRACTICE\\result.md")))
            writer.print(result);
        catch(FileNotFoundException ex)
            System.out.println("File not found");
        } catch (IOException e) {
        }
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA2\praktika2zadanie1\src\com\company\Main.java
```java
class Shape
    int h = 20;
    int l = 90;

    public String toString() {
                "h=" + h +
                ", l=" + l +
                '}';
}

	// write your code here
        classter.toString();
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA2\praktika2zadanie2\src\com\company\Main.java
```java

{
    int v = 2;

    {
    }
public class Main {
    public static void main(String[] args) {
        Ball abibas = new Ball();
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA2\praktika2zadanie3\src\com\company\Main.java
```java

{
    int series = 2;

    {
    }
public class Main {
    public static void main(String[] args) {
        Book kniga = new Book();
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA2\praktika2zadanie4\src\com\company\Main.java
```java
import java.util.ArrayList;

{
    String name = "Bobik";

    public String toString() {
                name + " " + age;

    {
        this.name = Name;

    {
    }
    String getName()
        return this.name;

    {
    }
    {
        this.name = Name;
}
class PitomnikSobak
    ArrayList dogs = new ArrayList();
    void addDog(int Age, String Name)
        Dog dg = new Dog(Age, Name);
    }


	// write your code here
        System.out.println(bobik.toString());
        pitomnik.addDog(3, "Sharik");
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA3\praktika3zadanie1\src\com\company\Circle.java
```java

    double x0, y0, R;
    public double getX0() {
    }
    public double getY0() {
    }
    public double getR() {
    }
    public void setR(double r) {
    }
    public void setY0(double y0) {
    }
    public void setX0(double x0) {
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA3\praktika3zadanie1\src\com\company\CircleTest.java
```java


        Circle c1 = new Circle();
        c1.setX0(0);

    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA3\praktika3zadanie2\src\com\company\Hand.java
```java

    private int l, s;
    public int getL() {
    }
    public void setL(int l) {
    }
    public int getS() {
    }
    public void setS(int s) {
    }
    @Override
        return "Hand{" +
                ", s=" + s +
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA3\praktika3zadanie2\src\com\company\Head.java
```java
public class Head {

        return h;

        this.h = h;

        return w;

        this.w = w;

        return v;

        this.v = v;

    public String toString() {
                "h=" + h +
                ", v=" + v +
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA3\praktika3zadanie2\src\com\company\Human.java
```java

    private Hand hand1 = new Hand();
    private Head head = new Head();
    private Leg leg2 = new Leg();
    public Hand getHand1() {
    }
    public Hand getHand2() {
    }
    public void setHand1(Hand hand) {
    }
    public void setHand2(Hand hand) {
    }
    public Head getHead() {
    }
    public void setHead(Head head) {
    }
    
        return leg1;
    
    public Leg getLeg2() {
    }
    public void setLeg1(Leg leg) {
    }
    public void setLeg2(Leg leg) {
    }
    private int tall;
    public int getTall() {
    }
    public void setTall(int tall) {
    }
    @Override
        return "Human{" +
                ", hand2=" + hand2 +
                ", leg1=" + leg1 +
                ", tall=" + tall +
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA3\praktika3zadanie2\src\com\company\Leg.java
```java
public class Leg {

        return h;

        this.h = h;

        return w;

        this.w = w;

        return s_f;

        this.s_f = s_f;

    public String toString() {
                "h=" + h +
                ", s_f=" + s_f +
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA3\praktika3zadanie2\src\com\company\Main.java
```java
public class Main {
    public static void main(String[] args) {
        human.setTall(2); // задается рост человека
        System.out.println(human.toString());
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA3\praktika3zadanie3\src\com\company\Book.java
```java

    private String author, name;

        return author;

        this.author = author;

        return name;

        this.name = name;

        return year;

        this.year = year;

        return edition_number;

        this.edition_number = edition_number;

    public String toString() {
                "author='" + author + '\'' +
                ", year=" + year +
                '}';
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA3\praktika3zadanie3\src\com\company\BookTest.java
```java


	Book book = new Book();
    book.setEdition_number(1);
	book.setYear(2010);
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA4\praktika4zadanie1\src\com\company\Circle.java
```java

    protected double radius;
    {
    }
    Circle(double radius, String color, boolean filled)
        super(color, filled);
    }
    public double getRadius() {
    }
    public void setRadius(double radius) {
    }
    @Override
        return 3.14 * radius * radius;

    public double getPerimeter() {
    }
    @Override
        return "Circle{" +
                ", color='" + color + '\'' +
                '}';
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA4\praktika4zadanie1\src\com\company\Main.java
```java


	// write your code here
        Rectangle rc = new Rectangle(1, 2, "Red", true);
        System.out.println(cr.toString());
        System.out.println(rc.toString());
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA4\praktika4zadanie1\src\com\company\Rectangle.java
```java
public class Rectangle extends Shape{

    {
        this.length = length;
    }
    Rectangle(double width, double length)
        super("Black", false);
        this.width = width;

        return width;

        this.width = width;

        return length;

        this.length = length;

    public double getArea() {


    public double getPerimeter() {
    }
    @Override
        return "Rectangle{" +
                ", length=" + length +
                ", filled=" + filled +
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA4\praktika4zadanie1\src\com\company\Shape.java
```java
public abstract class Shape {
    protected boolean filled;
    Shape(String color, boolean filled)
        this.color = color;
    }
    public String getColor() {
    }
    public void setColor(String color) {
    }
    public boolean isFilled() {
    }
    public void setFilled(boolean filled) {
    }
    public abstract double getArea();

    public String toString() {
                "color='" + color + '\'' +
                '}';
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA4\praktika4zadanie1\src\com\company\Square.java
```java

    private double side;
    {
        this.side = side;

    public double getArea() {
    }
    @Override
        return getPerimeter();

    {
    }
    public void setSide(double side)
        this.side = side;

    public String toString() {
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA5\praktika5zadanie1\src\com\company\Main.java
```java


        MovableCircle movcr = new MovableCircle(1, 0, 0);
        System.out.println(movcr);
        movRec.move(1, 0);
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA5\praktika5zadanie1\src\com\company\Movable.java
```java
public interface Movable {
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA5\praktika5zadanie1\src\com\company\MovableCircle.java
```java

    private int radius;

    {
        center.setX(x);
    }
    public double getArea() {
    }
    public double getPerimeter() {
    }
    public void setRadius(int radius) {
    }
    @Override
        center.move(right, down);

    public String toString() {
                "radius=" + radius +
                '}';
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA5\praktika5zadanie1\src\com\company\MovablePoint.java
```java

    private int x, y;
    public MovablePoint(int x, int y) {
        this.y = y;

        return x;

        this.x = x;

        return y;

        this.y = y;

    public void move(int right, int down) {
        this.y+=down;

    public String toString() {
                "x=" + x +
                '}';
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA5\praktika5zadanie1\src\com\company\MovableRectangle.java
```java


    private MovablePoint topLeft = new MovablePoint(0, 0);

    {
        bottomRight.setX(x2); bottomRight.setY(y2);

    {
    }

    {
        return abs(topLeft.getX() - bottomRight.getX());

    public double getArea()
        return getWidth() * getLength();

    {
    }

    public void move(int right, int down) {
        bottomRight.move(right, down);

    public String toString() {
                "topLeft=" + topLeft +
                '}';
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA6\praktika6zadanie1\Problem.java
```java

import java.util.Scanner;
public class Problem {
    static int[][] m1, m2;

    {
        {
                if (i == size - 1 && j == size - 1)
                else if (i == size - 1)
                else if (j == size - 1) {
                }
                    max = m1[i][j] + m2[i+1][j];
                        max = m1[i][j] + m2[i][j+1];
                }
        }
        return m2[0][0];
    public static void main(String[] args) {
        Random r = new Random();
        size = n.nextInt();
        m2 = new int[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                m1[i][j] = r.nextInt(500)-100;
            }
        }
        System.out.println(resultFunc());
}
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA78\Company.java
```java

import java.util.EnumMap;
import java.util.Random;
public class Company {
    private ArrayList<Manager> managers = new ArrayList<Manager>();
    private ArrayList<Operator> operators = new ArrayList<Operator>();

        return bs;

        return employeers;

        this.employeers = employeers;

        this.bs = bs;

    {
        employeers.add(empl);
        {
        }
        else if(empl.getPosition().getJobTitle() == "TopManager")
            topManagers.add((TopManager)empl.getPosition());

        {
        }

    {
        {
        }

    {
        employeers.remove(empl);
        {
            {
                    managers.remove(i);
        }
        else if(empl.getPosition().getJobTitle() == "TopManager")
            for(int i = 0; i < topManagers.size(); i++)
                if(topManagers.get(i) == empl.getPosition())
            }

        {
            {
                    operators.remove(i);
        }

    public double getIncome()
        double income = 0;
        {
        }
    }
    List<Employee> getTopSalaryStaff(int count)
        if(count <= employeers.size() && count >= 0)
            ArrayList<Employee> returnedEmpls= new ArrayList<Employee>();
            {
                {
                    {
                        employeers.set(j, employeers.get(j+1));
                    }
            }
            for(int i = 0; i < count; i++)
                returnedEmpls.add(employeers.get(i));

        }
            return null;

    {
        {
            ArrayList<String> names = new ArrayList<String>();
            {
                {
                    {
                        employeers.set(j, employeers.get(j+1));
                    }
            }
            for(int i = 0; i < count; i++)
                returnedEmpls.add(employeers.get(i));
            }
            return returnedEmpls;
        else
    }
    public void removeCompanyPosition(EmployeePosition position) {
        {
        }
        {
        }
        {
        }
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA78\Employee.java
```java

    private String name;
    private double baseSalary;
    private Company company;
    public Employee(String name, double salary, EmployeePosition position, Company company) {
        this.baseSalary = salary;
        this.company = company;

        this.name = name;
        this.position = position;

        this.position = position;

        this.name = name;
    }
    public Employee(double salary, EmployeePosition position) {
        this.position = position;

        this.baseSalary = salary;

        return name;

        return surname;
    
        this.surname = surname;
    public void setName(String name) {
    }
    public double getSalary() {
    }
    public void setSalary(double salary) {
    }
    public EmployeePosition getPosition() {
    }
    public void setPosition(EmployeePosition position) {
        if(company != null)
            company.removeCompanyPosition(position);
    }
    public Company getCompany() {
    }
    public void setCompany(Company company) {
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA78\EmployeePosition.java
```java

    String getJobTitle();
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA78\Main.java
```java

import java.util.Random;
public class Main {
        Company company = new Company();
        for(int i = 0; i < 180; i++)
            company.hire(new Employee(Math.random()*(60000-20000) + 20000, new Operator()));

        {
        }
        for(int i =0; i < 10; i++)
            company.hire(new Employee(Math.random()*(300000-100000) + 100000, new TopManager(company)));

        for(int i = 0; i < 10; i++)
            System.out.println(company.getTopSalaryStaff(10).get(i).getPosition().calcSalary(company.getTopSalaryStaff(10).get(i).getSalary()));
        System.out.println("30 самых низких зарплат: ");
        {
        }
        for(int i = 0; i < company.getEmployeers().size()/2; i++)
            company.fire(company.getEmployeers().get(i));

        for(int i = 0; i < 10; i++)
            System.out.println(company.getTopSalaryStaff(10).get(i).getPosition().calcSalary(company.getTopSalaryStaff(10).get(i).getSalary()));
        System.out.println("30 самых низких зарплат (после увольнения): ");
        {
        }
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA78\Manager.java
```java

    private Company company;

    {
    }
    @Override
        return baseSalary + 0.05 * count;

    public String getJobTitle() {
    }

null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA78\Operator.java
```java


    public double calcSalary(double baseSalary) {
    }
    @Override
        return "Operator";
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA78\TopManager.java
```java

    private Company company;
    public TopManager(Company company)
        this.company = company;
    @Override
        if(company.getIncome() > 10000000)
        else
    }
    @Override
        return "TopManager";
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA9\Company.java
```java


    private ArrayList<Employee> employeers = new ArrayList<Employee>();
    public void hire(Employee empl)
        employeers.add(empl);

    {
        {
        }

    {
    }
    public void fireAll(ArrayList<Employee> empl)
        for(int i = 0; i < empl.size(); i++)
            fire(empl.get(i));
    }
    public ArrayList<Employee> getEmployeers() {
    }
    public void setEmployeers(ArrayList<Employee> employeers) {
    }
    public void HandlerEmployees(EmployeerHandler handler, EmployeeSelector selector)
        for(int i = 0; i < employeers.size(); i++)
            if(selector.isNeed(employeers.get(i)))
                handler.doSome(employeers.get(i));
        }
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA9\Employee.java
```java


    private String name, surname;
    private String livePlace;
    private int salary;
    public Employee()


        this.salary = salary;

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
    }
    public void setName(String name) {
    }
    public String getSurname() {
    }
    public void setSurname(String surname) {
    }
    public LocalDate getDateOfBirth() {
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
    }
    public String getLivePlace() {
    }
    public void setLivePlace(String livePlace) {
    }
    public String getPhoneNumber() {
    }
    public void setPhoneNumber(String phoneNumber) {
    }
    public int getSalary() {
    }
    public void setSalary(int salary) {
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA9\EmployeerHandler.java
```java


    void doSome(Employee empl);
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA9\EmployeeSelector.java
```java

    boolean isNeed(Employee empl);
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA9\Main.java
```java


    public static void main(String[] args) {
        Random r = new Random();
            company.hire(new Employee(r.nextInt(100_000)));
        company.HandlerEmployees(new SalaryHandler(), new SalarySelector());
        company.HandlerEmployees(
                    @Override
                        System.out.println(empl.getSalary());

                new EmployeeSelector() {
                    public boolean isNeed(Employee empl) {
                    }
        System.out.println("----------------------");
    }
null
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA9\SalaryHandler.java
```java

    @Override
        System.out.println(empl.getSalary());
}
```
### D:\Projectss\Java\JAVA_MIREA_PRACTICE\src\PRAKTIKA9\SalarySelector.java
```java

    @Override
        return empl.getSalary() > 10000;
}
```
