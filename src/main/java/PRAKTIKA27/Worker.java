package PRAKTIKA27;

import java.util.ArrayList;

public class Worker {
    public int sum(Data data)
    {
        int sumOfVal = 0;
        ArrayList<Integer> values = data.getNumbers();
        for(Integer val : values)
        {
            sumOfVal+=val;
        }
        System.out.println(sumOfVal);
        return sumOfVal;
    }

    public void print(Data data)
    {
        ArrayList<String> values = data.getWords();
        String delimeter = data.getDelimeter();
        for(int i = 0; i < values.size(); i++)
        {
            System.out.print(values.get(i));
            if(i!=values.size()-1)
                System.out.print(delimeter);
        }
    }
}
