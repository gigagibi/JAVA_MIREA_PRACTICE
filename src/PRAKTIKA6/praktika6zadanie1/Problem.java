package PRAKTIKA6.praktika6zadanie1;

import java.util.Scanner;

public class Problem {
    static int[][] field;

    public static int solve(int i, int j)
    {
        if(i!=0 && j!=0)
        {
            if(field[i-1][j] > field[i][j-1])
                return field[i][j] + solve(i-1, j);
            else
                return field[i][j] + solve(i, j-1);
        }
        else if(i == 0 && j != 0)
        {
            return field[i][j] + solve(i, j-1);
        }
        else if (j == 0 && i != 0)
        {
            return field[i][j] + solve(i-1, j);
        }
        else if (i == 0 && j == 0)
        {
            return field[i][j];
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        field = new int[n][n];

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
                    System.out.print(field[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Maximum is " + solve(n-1, n-1));
    }
}
