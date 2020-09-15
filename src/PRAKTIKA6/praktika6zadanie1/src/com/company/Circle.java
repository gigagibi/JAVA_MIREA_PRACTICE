package PRAKTIKA6.praktika6zadanie1.src.com.company;

public class Circle extends Shape {
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float R) {
        this.radius = R;
    }

    @Override
    public float getArea() {
        return 3.14f * this.radius * this.radius;
    }
}
