package com.arjun.oca2;

public class TestClass {
    public static void main(String[] args) {
        extractInt(2.7);
        extractInt(2.0);
    }

    private static void extractInt(Double obj) {
        System.out.println(obj.intValue());
    }
}
