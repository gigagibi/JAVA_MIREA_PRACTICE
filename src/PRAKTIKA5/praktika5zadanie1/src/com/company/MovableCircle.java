package PRAKTIKA5.praktika5zadanie1.src.com.company;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center = new MovablePoint(0, 0);

    public MovableCircle(int radius, int x, int y)
    {
        this.radius = radius;
        center.setX(x);
        center.setY(y);
    }

    public double getArea() {
        return 3.14 * (double)radius * (double)radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * (double)radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void move(int right, int down) {
        center.move(right, down);
    }

    @Override
    public String toString() {
        return "MovableCirlce{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
