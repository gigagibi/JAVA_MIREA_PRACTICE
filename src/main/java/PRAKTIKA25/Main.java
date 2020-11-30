package PRAKTIKA25;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, String> hm = new MyHashMap<>();
        hm.add("Key1", "Value1");
        hm.add("Key2", "Value2");
        hm.add("Key3", "Value3");
        System.out.println(hm.get("Key1"));
    }
}
