package PRAKTIKA7.praktika7zadanie3.src.com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FurnitureShop shop = new FurnitureShop();
        shop.sell("Диван");
        shop.sell("Кресло");
        shop.addGoods(1, 1);
        for(int i = 0; i < 6; i++)
        {
            shop.sell("Диван");
            shop.sell("Кресло");
        }
    }
}
