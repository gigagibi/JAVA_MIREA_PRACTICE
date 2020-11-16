package PRAKTIKA1.praktika1zadanie3.src.com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum1, sum2, sum3, sc;
        sum1 = 0; sum2 = 0; sum3 = 0; sc = 0;
        int[] arr = new int[] {1, 2, 3, 4, 5};
        for(int i = 0; i < 5; i++)
        {
            sum1 += arr[i];
        }

        while (sc < 5)
        {
            sum2 += arr[sc];
            sc++;
        }

        sc = 0;
        do{
           sum3 += arr[sc];
           sc++;
        } while(sc < 5);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
