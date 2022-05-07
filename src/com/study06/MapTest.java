package com.study06;

import java.util.ArrayList;

public class MapTest {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        ArrayList b = a;
        a.add("Hello");
        a.add("World!");
        b.addAll(b);
        System.out.println(a);
        System.out.println(b);
    }
}
