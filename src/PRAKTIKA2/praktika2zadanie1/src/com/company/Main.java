package PRAKTIKA2.praktika2zadanie1.src.com.company;
class Shape
{
    int h = 20;
    int w = 40;
    int l = 90;
    int v = 2;

    @Override
    public String toString() {
        return "Shape{" +
                "h=" + h +
                ", w=" + w +
                ", l=" + l +
                ", v=" + v +
                '}';
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape classter = new Shape();
        classter.toString();
    }
}
