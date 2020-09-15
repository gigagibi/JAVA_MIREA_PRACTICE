package PRAKTIKA4.praktika4zadanie1.src.com.company;

public class Square extends Shape {
    private double side;
    Square(double side, String color, boolean filled)
    {
        super(color, filled);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return getPerimeter();
    }

    public double getSide()
    {
        return this.side;
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
