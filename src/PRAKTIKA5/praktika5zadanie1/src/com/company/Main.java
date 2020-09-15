package PRAKTIKA5.praktika5zadanie1.src.com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MovableCircle movcr = new MovableCircle(0, 0, 1, 1, 2);
        movcr.moveDown();
        movcr.moveLeft();
        System.out.println(movcr);
    }
}
