package PRAKTIKA8.praktika8zadanie2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;

public class Main extends JFrame{
    public Main(String str)
    {
        setTitle("Image");
        setSize(500, 500);
        DrawComponent comp = new DrawComponent(str);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(comp);
    }
    public static void main(String[] args) {
        Main window = new Main(args[0]);
    }
}