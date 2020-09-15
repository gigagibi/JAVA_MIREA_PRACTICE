package PRAKTIKA6.praktika6zadanie1.src.com.company;

public class Rectangle extends Shape{
    private float width, height;

    public float getWidth() {
        return width;
    }

    public void setWidth(float W) {
        this.width = W;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float H) {
        this.height = H;
    }

    @Override
    public float getArea() {
        return this.height * this.width;
    }
}
