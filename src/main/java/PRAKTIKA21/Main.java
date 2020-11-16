package PRAKTIKA21;

import java.util.Scanner;

public class Main {
    public static void appServer() {
        Scanner sc = new Scanner(System.in);
        String choose;


    }

    public static void appFile() {

    }

    public static void main(String[] args) {
        int choose;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1, если хотите работать с сервером, или 2, если хотите работать с файлами локально");
        choose = sc.nextInt();
        while (choose != 1 && choose != 2)
        {
            if(choose == 1)
                appServer();
            else if(choose == 2)
                appFile();
            else
                System.out.println("Введена неправильная команда");
        }
    }
}
