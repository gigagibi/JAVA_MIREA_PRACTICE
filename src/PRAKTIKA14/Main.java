package PRAKTIKA14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void replaceByRules(ArrayList<String> rules, String str)
    {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        ArrayList<String> rules = new ArrayList<String>();
        int N = sc.nextInt();
        for(int i = 0; i < N; i++)
        {
            String rule = sc.nextLine();
            rules.add(rule);
        }
        str = sc.nextLine();
        replaceByRules(rules, str);
    }
}
