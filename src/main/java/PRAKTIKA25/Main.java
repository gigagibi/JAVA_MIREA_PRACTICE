package PRAKTIKA25;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, String> hmStr = new MyHashMap<>();
        hmStr.add("Ключ1", "Значение1");
        hmStr.add("Ключ2", "Значение2");
        hmStr.add("Ключ2", "Значение2");

        System.out.println(hmStr.get("Ключ2"));

        MyHashMap<String, Integer> hmIntStr = new MyHashMap<>();
        hmIntStr.add("1", 1);
        hmIntStr.add("2", 2);
        hmIntStr.add("3", 3);

        System.out.println(hmIntStr.get("3"));
    }
}
