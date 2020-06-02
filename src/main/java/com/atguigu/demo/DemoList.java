package com.atguigu.demo;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        new HashMap<>()
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        int size = list.size();
        for (int i = 0; i <size ; i++) {
            if (i == 1){
                list.remove(i);
            }
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
