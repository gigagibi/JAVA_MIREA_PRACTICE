package PRAKTIKA6.praktika6zadanie2.src.com.company;
import java.time.Clock;

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
}
