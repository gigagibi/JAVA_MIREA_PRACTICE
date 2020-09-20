package PRAKTIKA9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame{
    private JButton drawButton = new JButton("Нарисовать");
    public MainWindow()
    {
        setTitle("Студия дизайна Арсения Гусева");
        setSize(800, 600);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(drawButton);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(500, 300);
        setVisible(true);
        setResizable(false);
        DrawPanel dp = new DrawPanel();
        dp.setBounds(0, 50, 800, 550);
        dp.setVisible(true);
        add(dp);
        container.add(dp);
        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dp.Draw();
            }
        });
    }

    public static void main(String[] args) {
        MainWindow window = new MainWindow();
    }
}
