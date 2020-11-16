package PRAKTIKA2.praktika2zadanie2.src.com.company;

class Ball
{
    int R = 1;
    int v = 2;
    String firm = "abibas";

    void output()
    {
        System.out.println(R + " " + v + " " + firm);
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Ball abibas = new Ball();
        abibas.output();
    }
}
