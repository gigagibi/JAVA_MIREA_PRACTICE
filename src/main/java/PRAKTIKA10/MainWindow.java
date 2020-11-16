package PRAKTIKA10;

import PRAKTIKA9.Main;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow()
    {
        JPanel operations = new JPanel();
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton divButton = new JButton("/");
        JButton mulButton = new JButton("*");

        FlowLayout fl = new FlowLayout();
        operations.add(addButton);
        operations.add(subButton);
        operations.add(divButton);
        operations.add(mulButton);
        operations.setLayout(fl);

        JTextField numA = new JTextField();
        JTextField numB = new JTextField();
        JLabel result = new JLabel();
        GridLayout gr = new GridLayout(4, 1);

        add(numA);
        add(operations);
        add(numB);
        add(result);
        this.setLayout(gr);
        setSize(300, 500);
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        addButton.addActionListener(action ->
        {
            try
            {
                result.setText(String.format("%.4f",Float.parseFloat(numA.getText()) + Float.parseFloat(numB.getText())));
            }
            catch (Exception ex)
            {
                result.setText(ex.getMessage());
            }
        });

        subButton.addActionListener(action ->
        {
            try
            {
                result.setText(String.format("%.4f",Float.parseFloat(numA.getText()) - Float.parseFloat(numB.getText())));
            }
            catch (Exception ex)
            {
                result.setText(ex.getMessage());
            }

        });

        divButton.addActionListener(action ->
        {
            try{
                result.setText(String.format("%.4f", Float.parseFloat(numA.getText()) / Float.parseFloat(numB.getText())));
            }
            catch (Exception ex)
            {
                result.setText(ex.getMessage());
            }
        });

        mulButton.addActionListener(action ->
        {
            try
            {
                result.setText(String.format("%.4f", Float.parseFloat(numA.getText()) * Float.parseFloat(numB.getText())));
            }
            catch (Exception ex)
            {
                result.setText(ex.getMessage());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow window = new MainWindow();
    }
}
