package com.arjun.oca2;

public class Test5 {
    public static void main(String[] args) {
        int x=10;
        int a=x++;
        int b=++x;
        int c=x++;
        int d=(a<b)?(a<c)?a:(b<c)?b:c:x;
        System.out.println(d);
    }
}
