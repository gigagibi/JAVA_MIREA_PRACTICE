package PRAKTIKA9;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent{
    protected Color color;
    protected int x0, y0;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX0() {
        return x0;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public int getY0() {
        return y0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }
}
