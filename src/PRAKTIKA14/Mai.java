package PRAKTIKA14;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mai {
    private static ArrayList<Item> items = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Item item = readItem(scanner);
//        System.out.println(item);

        Pattern pattern = Pattern.compile("(?<name>\\w+) (?<price>\\d+) (?<count>\\d+) (?<desc>\\w+)");
        Matcher matcher = pattern.matcher("Item1 23 65 dsfgsdfg");
        if (matcher.find())
        {
            System.out.println(matcher.groupCount());
            System.out.println(matcher.group());
            System.out.println(matcher.group("name"));
            System.out.println(matcher.group("price"));
            System.out.println(matcher.group("count"));
            System.out.println(matcher.group("desc"));
        } else {
            System.out.println("incorrect input format");
        }
    }

    private static Item readItem(Scanner scanner) {
        String line = scanner.nextLine();
        System.out.println(line);
        String[] itemArgs = line.split(" ");
        for (int i = 0; i < itemArgs.length; i++) {
            System.out.println(i + " " + itemArgs[i]);
        }
        return new Item(
                itemArgs[0],
                Integer.parseInt(itemArgs[1]),
                Integer.parseInt(itemArgs[2]),
                itemArgs[3]);
    }
}

class Item{
    private String name, desc;
    private int price, count;

    public Item(String name, int price, int count, String desc) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
