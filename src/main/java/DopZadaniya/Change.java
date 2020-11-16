package DopZadaniya;

import java.util.Scanner;

public class Change {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сдачу: ");
        int change = sc.nextInt();
        int howManyWays = 0;
        while (change >= 0) {
            howManyWays += change / 3 + 1;
            change -= 5;
        }
        System.out.println("Всего " + howManyWays + " способов");
    }
}
