package PRAKTIKA6.praktika6zadanie1.src.com.company;

public abstract class Shape {
    private float x, y;

    public void setPosition(float X, float Y)
    {
        x = X;
        y = Y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public abstract float getArea();
}
