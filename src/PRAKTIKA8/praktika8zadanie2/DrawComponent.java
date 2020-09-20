package PRAKTIKA8.praktika8zadanie2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class DrawComponent extends JComponent {
    private Image image;

    public DrawComponent(String str)
    {
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
}
