package PRAKTIKA14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static String replaceByRulesREGEX(ArrayList<String> rules, String str)
    {
        String regex = new String();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rules.size(); i++)
        {
            sb.append(rules.get(i).split(" ")[0]);
            if(i!= rules.size() -1)
                sb.append("|");
        }

        HashMap<String, String> replaceMap = new HashMap<String, String>();
        for(String t : rules)
        {
            replaceMap.put(t.split(" ")[0], t.split(" ")[1]);
        }

        Pattern pattern = Pattern.compile(sb.toString());
        Matcher matcher = pattern.matcher(str);

        return matcher.replaceAll(x -> replaceMap.get(x.group()));
    }


    public static String replaceByRules(ArrayList<String> rules, String str)
    {
        String line = str;
        String lineAns = line;
        int b = 0, e = 0;
        ArrayList<String[]> replaceComponents = new ArrayList<String[]>();
        ArrayList<String> replaced = new ArrayList<String>();
        HashMap<String, String> replaceMap = new HashMap<String, String>();
        for(String t : rules)
        {
            replaceComponents.add(t.split(" "));
            replaceMap.put(t.split(" ")[0], t.split(" ")[1]);
        }
        int size = line.length();

        while(e < size-1 && b < size-1)
        {
            StringBuilder sb = new StringBuilder();
            while(replaceMap.get(sb.toString()) == null && e < line.length())
            {
                sb.append(line.charAt(e));
                e++;
            }
            if(e < line.length())
                b = e;
            else {
                replaced.add(String.valueOf(line.charAt(b)));
                e = ++b;
            }
            if(replaceMap.get(sb.toString()) != null)
                replaced.add(replaceMap.get(sb.toString()));
        }
        StringBuilder sb = new StringBuilder();
        for(String t : replaced)
        {
            sb.append(t);
        }
        for(int i = b; i < line.length(); i++)
        {
            sb.append(line.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        ArrayList<String> rules = new ArrayList<String>();
        int N = sc.nextInt();

        if(N < 1 || N > 300)
            throw new IllegalArgumentException("incorrect N. N must be like: 1 <= N <= 300");

        sc = new Scanner(System.in);
        for(int i = 0; i < N; i++)
        {
            String rule = sc.nextLine();
            rules.add(rule);
        }

        str = sc.nextLine();
        System.out.println("Without regex: " + replaceByRules(rules, str));
        System.out.println("With regex: " + replaceByRulesREGEX(rules, str));
    }
}
