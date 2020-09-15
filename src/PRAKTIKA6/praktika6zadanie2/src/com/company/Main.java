package PRAKTIKA6.praktika6zadanie2.src.com.company;

public class Main {

    public static void main(String[] args) {
        MovableRectangle movrc = new MovableRectangle(0, 0, 1, 1, 1, 2);
        if(!movrc.checkSpeeds())
        {
            System.out.println("Ошибка! Разные скорости точек у ппрямугольников!");
        }
        else
        {
            System.out.println("Со скоростями точек все ок!");
        }
    }
}
