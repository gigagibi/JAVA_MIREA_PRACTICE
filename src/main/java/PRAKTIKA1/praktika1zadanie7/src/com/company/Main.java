package PRAKTIKA1.praktika1zadanie7.src.com.company;

public class Main {

   static int fac(int n)
    {
        if(n == 0 || n == 1)
            return 1;
        else
            return n * fac(n-1);
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println(fac(5));
    }
}
