package com.arjun.Interface1;
interface amit{
    default void m1(){
        System.out.println("ADM");
    }
}
interface amit2{
    default void m2(){
        System.out.println("A2DM");
    }
}
public class Test3 {
    public static void main(String[] args) {
        Test3 test3= new Test3();
        test3.m1();
    }
    public void m1(){
        System.out.println("Test D M");
    }
}
