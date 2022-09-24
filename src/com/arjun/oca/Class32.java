package com.arjun.oca;


public class Class32 {
    public static void main(String[] args) {
        String s="test";
        System.out.println(s.length()); //length() is applicable for Strings

        String[] strings= new String[3];
        System.out.println(strings.length);  //length attribute is applicable for Arrays

        String s1= "Testing     ";
        System.out.println(s1.toString());
        System.out.println(s1.toUpperCase());
        System.out.println(s1+"s");
        System.out.println(s1.trim()+""+"t");   //white spaces are removed from string object
            }
        }
