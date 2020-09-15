package PRAKTIKA6.praktika6zadanie1.src.com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle cr = new Circle();
        Square sq = new Square();
        Rectangle rc = new Rectangle();
        rc.setHeight(1);
        rc.setWidth(2);
        sq.setSide(3);
        cr.setRadius(2);
        System.out.println("Area of the Square " + sq.getArea());
        System.out.println("Area of the Rectangle " + rc.getArea());
        System.out.println("Area of the Circle " + cr.getArea());
    }
}
