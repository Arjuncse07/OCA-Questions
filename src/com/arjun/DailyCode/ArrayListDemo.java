package com.arjun.DailyCode;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        if (al.remove("C")){
            al.add("D");
        }
        if (al.remove("A")){
            al.add(1,"E");
        }
        System.out.println(al);
    }
}
