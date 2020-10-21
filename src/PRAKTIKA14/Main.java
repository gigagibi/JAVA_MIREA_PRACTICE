package PRAKTIKA14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static String replaceByRulesREGEX(ArrayList<String> rules, String str) //почему то m.group() возвращает только одно совпадение (не AA и 111, а только AA) хотя groupCount() = 2
    {
        /*String regex = new String();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rules.size(); i++)
        {
            sb.append(rules.get(i).split(" ")[0]);
        }*/
        Pattern p = Pattern.compile("AA|11");//sb.toString());
        Matcher m = p.matcher("AA11AA1");
        //return m.replaceAll("1");
        //m.matches();
        //return m.group(0).replaceAll("\\w+", "1");
        StringBuilder bbb = new StringBuilder();

        String b1 = new String();

        int sc = 0;
        while (m.find())
        {
            sc++;
            //m.matches();
            System.out.println(m.group());
            b1 = m.replaceFirst("3");
            //m = p.matcher(b1);
            m.find(sc);
        }
       // b1 =
        return b1;
    }

    /*public static String replaceByRulesREGEX(ArrayList<String> rules, String str)
    {

        ArrayList<Pattern> patterns = new ArrayList<Pattern>();
        ArrayList<Matcher> matchers = new ArrayList<Matcher>();
        for(int i = 0; i < rules.size(); i++)
        {
            patterns.add(Pattern.compile(rules.get(i).split(" ")[i]));
            matchers.add(patterns.get(i).matcher());
        }
        Pattern pattern = Pattern.compile("af");
        Matcher matcher = pattern.matcher("afwdv3r thyth");
        if(matcher.find())
        {
            return matcher.replaceAll("");
        }
        //matchers.get(i).
        else
            return "Error";
    }*/

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
        System.out.println(replaceByRules(rules, str));
        //System.out.println(replaceByRulesREGEX(null, null));
    }
}
