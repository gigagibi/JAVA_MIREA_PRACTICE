package PRAKTIKA9;

import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(int x0, int y0, int radius)
    {
        this.x0 = x0;
        this.y0 = y0;
        this.radius = radius;
        this.color = new Color((float)Math.random(), (float)Math.random(), (float)Math.random());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(getColor());
        g.fillOval(this.x0, this.y0, this.radius, this.radius);
    }

}
