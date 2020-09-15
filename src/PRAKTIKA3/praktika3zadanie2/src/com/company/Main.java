package PRAKTIKA3.praktika3zadanie2.src.com.company;
public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.setTall(2); // задается рост человека
        human.getHand1().setL(3); //задается длина 1 руки
        System.out.println(human.toString());
    }
}
