package PRAKTIKA25;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, String> hm = new MyHashMap<>();
        hm.add("Key1", "Value1");
        hm.add("Key2", "Value2");
        hm.add("Key3", "Value3");
        hm.add("Key3", "Value2");
        System.out.println(hm.get("Key3"));
        hm.remove("Key2");
        System.out.println(hm.get("Key2"));

        for(ArrayList<Node<String, String>> value : hm)
        {
            if(value.size()!=0)
                System.out.println(value.get(value.size()-1).getValue());
        }
    }
}
