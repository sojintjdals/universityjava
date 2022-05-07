package com.study06;

import java.util.HashMap;

public class CheckHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String,String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");
        map.put("D", "d");
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("Z"));
        System.out.println(map.containsValue("a"));
        System.out.println(map.containsValue("z"));
    }
}
