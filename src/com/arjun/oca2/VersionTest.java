package com.arjun.oca2;

public class VersionTest {
    private static void m(Object obj) {
        System.out.println("Object version");
    }

    private static void m(Number obj) {
        System.out.println("Number version");
    }

    private static void m(Double obj) {
        System.out.println("Double version");
    }

    public static void main(String[] args) {
        m(1);
    }
}
