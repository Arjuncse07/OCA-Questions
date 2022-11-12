package com.arjun.oca;

public class PalindromString {
    public static void main(String[] args) {
        String s="MADAM";
        StringBuffer stringBuffer= new StringBuffer(s);
        stringBuffer.reverse();
        String reverse=stringBuffer.toString();
        if(s.equals(reverse)){
            System.out.println("Palindrom String");
        }else {
            System.out.println("Not a plaindrom");
        }
    }
}
