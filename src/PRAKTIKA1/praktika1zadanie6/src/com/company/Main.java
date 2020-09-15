package PRAKTIKA1.praktika1zadanie6.src.com.company;
import java.lang.Math;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] arr = new double[5];
        System.out.println("Массив: ");
        for(int i = 0; i < 5; i++)
        {
            arr[i] = (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);

        System.out.println("Сортированный массив: ");
        for(int i = 0; i < 5; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
