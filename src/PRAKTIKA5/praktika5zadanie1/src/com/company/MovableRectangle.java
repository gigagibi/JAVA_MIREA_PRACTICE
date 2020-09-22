package PRAKTIKA5.praktika5zadanie1.src.com.company;

import static java.lang.Math.abs;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft = new MovablePoint(0, 0);
    private MovablePoint bottomRight = new MovablePoint(0, 0);

    MovableRectangle(int x1, int y1, int x2, int y2)
    {
        topLeft.setX(x1); topLeft.setY(y1);
        bottomRight.setX(x2); bottomRight.setY(y2);
    }

    public double getWidth()
    {
        return abs(topLeft.getY() - bottomRight.getY());
    }


    public double getLength()
    {

        return abs(topLeft.getX() - bottomRight.getX());
    }


    public double getArea()
    {
        return abs(topLeft.getY() - bottomRight.getY()) * abs(topLeft.getX() - bottomRight.getX());
    }

    public double getPerimeter()
    {
        return 2*(abs(topLeft.getY() - bottomRight.getY()) + abs(topLeft.getX() - bottomRight.getX()));
    }


    @Override
    public void move(int right, int down) {
        topLeft.move(right, down);
        bottomRight.move(right, down);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
