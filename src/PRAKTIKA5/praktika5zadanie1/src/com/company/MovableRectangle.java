package PRAKTIKA5.praktika5zadanie1.src.com.company;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft = new MovablePoint(0, 0);
    private MovablePoint bottomRight = new MovablePoint(0, 0);
    protected double width, length;

    MovableRectangle(double width, double length)
    {
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return this.width + this.length;
    }
    MovableRectangle(int x1, int y1, int x2, int y2)
    {
        topLeft.setX(x1); topLeft.setY(y1);
        bottomRight.setX(x1); bottomRight.setY(y1);
    }

    @Override
    public void move(int right, int down) {
        topLeft.move(right, down);
        bottomRight.move(right, down);
    }
}
