package PRAKTIKA8.praktika8zadanie1;

import java.awt.*;
import javax.swing.*;

public class Rectangle extends Shape{
    private int w, h;

    public Rectangle(int x0, int y0, int w, int h)
    {
        this.h = h;
        this.w = w;
        this.x0 = x0;
        this.y0 = y0;
        this.color = new Color((float)Math.random(), (float)Math.random(), (float)Math.random());
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(getColor());
        g.fillRect(this.x0, this.y0, this.w, this.h);
    }
}
