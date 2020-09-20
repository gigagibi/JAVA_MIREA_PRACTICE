package PRAKTIKA9;

import PRAKTIKA8.praktika8zadanie2.DrawComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel{
    private Circle[] Circles = new Circle[(int)(Math.random()*20)];
    private Rectangle[] Rects = new Rectangle[20-Circles.length];
    private boolean canDraw = false;

    public void Draw()
    {
        for(int i = 0; i < Circles.length; i++)
        {
            Circles[i] = new Circle((int) (Math.random() * 600 + 50), (int) (Math.random() * 600 + 50),(int) (Math.random() * 100));
        }
        for(int i = 0; i < Rects.length; i++)
        {
            Rects[i] = new Rectangle((int) (Math.random() * 600 + 50), (int) (Math.random() * 600 + 50), (int) (Math.random() * 50), (int) (Math.random() * 50));
        }
        canDraw = true;
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        if(canDraw)
        {
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

}
