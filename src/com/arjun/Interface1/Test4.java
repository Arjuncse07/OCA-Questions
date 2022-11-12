package com.arjun.Interface1;
interface Interf{
    public static void m1(){
        System.out.println("Interface Static Method");
    }
}
public class Test4 implements  Interf {
    public static void m1(){
        System.out.println("Test Class Static Method");
    }

    public static void main(String[] args) {
        Test4 test4= new Test4();
        Test4.m1();
        Interf.m1();
    }
}
