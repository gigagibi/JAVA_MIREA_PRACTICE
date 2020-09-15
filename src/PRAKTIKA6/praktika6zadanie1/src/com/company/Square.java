package PRAKTIKA6.praktika6zadanie1.src.com.company;

public class Square extends Shape {
    private float side;

    public float getSide() {
        return side;
    }

    public void setSide(float S) {
        this.side = S;
    }

    @Override
    public float getArea() {
        return side * side;
    }
}
