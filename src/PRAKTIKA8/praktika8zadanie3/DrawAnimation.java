package PRAKTIKA8.praktika8zadanie3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class DrawAnimation extends JComponent implements ActionListener {
    private Image image;
    private Timer timer;
    private int counter = 0;
    public void Draw(String str)
    {
        timer = new Timer(16, this);
        timer.start();
        setFocusable(true);
        try
        {
            image = ImageIO.read(new File(str));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(image == null) return;
        g.drawImage(image, 0, 0, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}