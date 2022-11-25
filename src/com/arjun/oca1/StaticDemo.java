package com.arjun.oca1;

public class StaticDemo {
    static {
        m1(); //direct read
    }
    public static void m1(){
        System.out.println(x);
    }
    static int x=10;

    public static void main(String[] args) {

    }
}
