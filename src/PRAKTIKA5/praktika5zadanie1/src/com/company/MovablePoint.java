package PRAKTIKA5.praktika5zadanie1.src.com.company;


public class MovablePoint implements Movable{
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveDown() {
        for(float i = 0; i < 10f; i+= 0.01f)
        {
            x += 0;
            y += ySpeed;
        }
    }

    @Override
    public void moveLeft() {
        for(float i = 0; i < 10f; i+= 0.01f)
        {
            x -= xSpeed;
            y += 0;
        }
    }

    @Override
    public void moveRight() {
        for(float i = 0; i < 10f; i+= 0.01f)
        {
            x += xSpeed;
            y += 0;
        }
    }

    @Override
    public void moveUp() {
        for(float i = 0; i < 10f; i+= 0.01f)
        {
            x += 0;
            y -= ySpeed;
        }
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
