package PRAKTIKA8.praktika8zadanie3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.util.Scanner;

public class Main extends JFrame{
    public Main() {
        setTitle("Фортунайтэ");
        setSize(800, 500);
        DrawAnimation anim = new DrawAnimation();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(anim);
        String pathToTheImages = "D:\\Projectss\\Java\\PRAKTIKA_Gudaev.I.I_IVBO-07-19\\src\\PRAKTIKA8\\praktika8zadanie3\\dance"; //Введите путь к картинкам
        while (true)
        {
            for(int i = 1; i <= 14; i++)
            {
                try {
                    Thread.sleep(130);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                anim.Draw(pathToTheImages + Integer.toString(i) + ".png");

            }
        }

    }
    public static void main(String[] args){
        Main window = new Main();
    }
}