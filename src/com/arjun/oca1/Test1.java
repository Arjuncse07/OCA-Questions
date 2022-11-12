package com.arjun.oca1;

public class Test1 {
    public void print(Integer i) {
        System.out.println("Integer");
    }

    public void print(int i) {
        System.out.println("int");
    }

    public void print(long i) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        Test1 test1= new Test1();
        test1.print(10);
    }
}
