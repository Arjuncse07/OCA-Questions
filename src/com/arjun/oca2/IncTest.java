package com.arjun.oca2;

public class IncTest {
    public static void main(String[] args) {
        int a = 10;
        if (a++ > 10) {
            System.out.println("true");
        }
        {
            System.out.println("false");
        }
        System.out.println("ABC");
    }
}
