package PRAKTIKA8.praktika8zadanie1;

import java.awt.*;
import javax.swing.*;
import java.lang.Math;

public class DrawPanel extends JPanel{
    public Circle[] Circles = new Circle[(int)(Math.random()*20)];
    public Rectangle[] Rects = new Rectangle[20-Circles.length];

    public DrawPanel()
    {
        for(int i = 0; i < Circles.length; i++)
        {
            Circles[i] = new Circle((int) (Math.random() * 600 + 50), (int) (Math.random() * 600 + 50),(int) (Math.random() * 100));
        }
        for(int i = 0; i < Rects.length; i++)
        {
            Rects[i] = new Rectangle((int) (Math.random() * 600 + 50), (int) (Math.random() * 600 + 50), (int) (Math.random() * 50), (int) (Math.random() * 50));
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for(int i = 0; i < Circles.length; i++)
        {
            Circles[i].paintComponent(g2d);
        }
        for(int i = 0; i < Rects.length; i++)
        {
            Rects[i].paintComponent(g2d);
        }
    }

}
