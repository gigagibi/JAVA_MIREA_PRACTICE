package PRAKTIKA6.praktika6zadanie1;

import java.util.Random;
import java.util.Scanner;

public class Problem {

    static int[][] m1, m2;
    static int size, max;

    public static int resultFunc()
    {
        for (int i = size - 1; i >= 0; i--)
        {
            for (int j = size - 1; j >= 0; j--) {
                if (i == size - 1 && j == size - 1)
                    m2[i][j] = m1[i][j];
                else if (i == size - 1)
                    m2[i][j] = m1[i][j] + m2[i][j+1];
                else if (j == size - 1) {
                    m2[i][j] = m1[i][j] + m2[i + 1][j];
                }
                else{
                    max = m1[i][j] + m2[i+1][j];
                    if(max<m1[i][j] + m2[i][j+1])
                        max = m1[i][j] + m2[i][j+1];
                    m2[i][j] = max;
                }
            }
        }

        return m2[0][0];
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Random r = new Random();

        size = n.nextInt();
        m1 = new int[size][size];
        m2 = new int[size][size];

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                m1[i][j] = r.nextInt(500)-100;
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(resultFunc());
    }
}

