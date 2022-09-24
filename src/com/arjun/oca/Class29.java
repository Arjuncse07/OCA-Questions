package com.arjun.oca;


public class Class29 {
    public static void main(String[] args) {
        StringBuilder stringBuilder= new StringBuilder("abc");
        String s="abc";
        stringBuilder.reverse().append("d");
        s.toUpperCase().concat("d");
        System.out.println(".."+stringBuilder+"..."+s+"..");
    }
}
