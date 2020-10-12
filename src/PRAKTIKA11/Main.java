package PRAKTIKA11;

import java.lang.Thread;

public class Main {
    public static long hardWork(int value, int count)
    {
        long a = 0;
        for(int i = 0; i < count; i++)
        {
            a += (value+a)*(value+a);
        }
        return a;
    }

}
