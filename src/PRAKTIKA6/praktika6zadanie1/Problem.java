package PRAKTIKA6.praktika6zadanie1;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] field = new int[n][n];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                field[i][j] = (int)(Math.random() * 100 - 50);
            }
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(field[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
