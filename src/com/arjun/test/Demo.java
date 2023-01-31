package com.arjun.test;

public class Demo {
    public String isPalindrom(String str) {
        int n = str.length();
        int left = 0, right = n - 1;
        while (left< right){
            if (str.charAt(left++) != str.charAt(right--)){
                System.out.println("This is not a valid palindrom string:"+str);
            }
        }
        return "This is a valid Palindrom String:"+str;
    }

    public static void main(String[] args) {
        Demo demo=  new Demo();
        System.out.println(demo.isPalindrom("amit"));

    }


}
