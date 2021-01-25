package com.hrbu.collection;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(1);
        arrayList.add("ad1");

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
