package PRAKTIKA5.praktika5zadanie1.src.com.company;

public class Main {

    public static void main(String[] args) {
        MovableCircle movcr = new MovableCircle(1, 0, 0);
        movcr.move(2, 4);
        System.out.println(movcr);
        MovableRectangle movRec = new MovableRectangle(0, 0, 2, 3);
        movRec.move(1, 0);
        System.out.println(movRec);
    }
}