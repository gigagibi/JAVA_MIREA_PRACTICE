package PRAKTIKA6.praktika6zadanie2.src.com.company;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft = new MovablePoint(0, 0, 0, 0);
    private MovablePoint bottomRight = new MovablePoint(0, 0, 0, 0);

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft.x = x1; topLeft.y = y1; topLeft.xSpeed = xSpeed; topLeft.ySpeed = ySpeed;
        bottomRight.x = x2; bottomRight.y = y2; bottomRight.xSpeed = xSpeed; bottomRight.ySpeed = ySpeed;
    }

    public boolean checkSpeeds()
    {
        if(topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public void moveDown() {
        if(checkSpeeds())
        {
            for(float i = 0; i < 10f; i+= 0.01f)
            {
                topLeft.x += 0;
                topLeft.y += topLeft.ySpeed;
                bottomRight.x += 0;
                bottomRight.y += topLeft.ySpeed;
            }
        }

    }

    @Override
    public void moveLeft() {
        if(checkSpeeds())
        {
            for(float i = 0; i < 10f; i+= 0.01f)
            {
                topLeft.x -= topLeft.xSpeed;
                topLeft.y += 0;
                bottomRight.x += 0;
                bottomRight.y += bottomRight.ySpeed;
            }
        }

    }

    @Override
    public void moveRight() {
        if(checkSpeeds())
        {
            for(float i = 0; i < 10f; i+= 0.01f)
            {
                topLeft.x += topLeft.xSpeed;
                topLeft.y += 0;
                bottomRight.x += 0;
                bottomRight.y += bottomRight.ySpeed;
            }
        }

    }

    @Override
    public void moveUp() {
        if(checkSpeeds())
        {
            for(float i = 0; i < 10f; i+= 0.01f)
            {
                topLeft.x += 0;
                topLeft.y -= topLeft.ySpeed;
                bottomRight.x += 0;
                bottomRight.y += bottomRight.ySpeed;
            }
        }

    }
}
