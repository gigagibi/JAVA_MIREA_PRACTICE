package PRAKTIKA2.praktika2zadanie3.src.com.company;

class Book
{
    int pages = 200;
    int series = 2;
    String name = "HowTo";

    void output()
    {
        System.out.println(pages + " " + series + " " + name);
    }
}
public class Main {

    public static void main(String[] args) {
        // write your code here
        Book kniga = new Book();
        kniga.output();
    }
}
