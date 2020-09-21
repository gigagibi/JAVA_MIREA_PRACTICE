package PRAKTIKA5.praktika5zadanie1.src.com.company;

public class MovablePoint implements Movable{
    private int x, y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
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
        this.x+=right;
        this.y+=down;
    }
}
