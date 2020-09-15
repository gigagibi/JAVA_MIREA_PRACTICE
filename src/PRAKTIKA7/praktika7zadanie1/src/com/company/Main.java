package PRAKTIKA7.praktika7zadanie1.src.com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bowl bowl = new Bowl();
        Cup cup = new Cup();
        cup.fill("Кефир");
        bowl.fill("Борщ");
        System.out.println("В кружку налит напиток: " + cup.getDrinkName());
        System.out.println("В глубокую тарелку налит суп: " + bowl.getSoupName());
        cup.drink();
        bowl.eat();
        System.out.println(cup.toString());
        System.out.println(bowl.toString());
    }
}
