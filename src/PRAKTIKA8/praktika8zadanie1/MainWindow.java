package PRAKTIKA8.praktika8zadanie1;

import java.awt.*;
import javax.swing.*;

public class MainWindow extends JFrame{
    public MainWindow()
    {
        setTitle("Рисование 20 фигур");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(500, 300);
        JLayeredPane lp = getLayeredPane();
        setVisible(true);
        setResizable(false);
        add(new DrawPanel());
    }

    public static void main(String[] args) {
        MainWindow window = new MainWindow();
    }
}
