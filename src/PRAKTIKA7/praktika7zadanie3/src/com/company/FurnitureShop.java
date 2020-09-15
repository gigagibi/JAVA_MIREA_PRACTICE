package PRAKTIKA7.praktika7zadanie3.src.com.company;

import java.util.ArrayList;

public class FurnitureShop {
    ArrayList<Sofa> sofaList = new ArrayList<Sofa>();
    ArrayList<Chair> chairList = new ArrayList<Chair>();

    FurnitureShop()
    {
        for(int i = 0; i < 5; i++)
        {
            Sofa sofa = new Sofa();
            sofaList.add(sofa);
            Chair chair = new Chair();
            chairList.add(chair);
        }
    }
    public void addGoods(int S, int C)
    {
        for(int i = 0; i < S; i++)
        {
            Sofa sofa = new Sofa();
            sofaList.add(sofa);
            System.out.println("Диванов добавлено - " + S);
        }

        for(int i = 0; i < C; i++)
        {
            Chair chair = new Chair();
            chairList.add(chair);
            System.out.println("Кресел добавлено - " + C);
        }
    }

    public void sell(String Good)
    {
        if(Good == "Диван")
        {
            if(sofaList.size() != 0)
            {
                System.out.println(Good + " продан");
                sofaList.remove(sofaList.size() - 1);
                System.out.println("Осталось товара " + Good + " " + sofaList.size() + " штук");
            }
            else
            {
                System.out.println(Good + " отсутствует!");
            }
        }
        else if(Good == "Кресло")
        {
            if(chairList.size() != 0)
            {
                System.out.println(Good + " продан");
                chairList.remove(chairList.size() - 1);
                System.out.println("Осталось товара " + Good + " " + chairList.size() + " штук");
            }
            else
            {
                System.out.println(Good + " отсутствует!");
            }
        }


    }



}
