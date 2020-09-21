package PRAKTIKA5.praktika5zadanie1.src.com.company;

public class MovableCirlce implements Movable{
    private int radius, x, y;

    public MovableCircle(int radius, int x, int y)
    {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return 3.14 * (double)radius * (double)radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * (double)radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void move(int right, int down) {
        this.x += right;
        this.y += down;
    }
}
