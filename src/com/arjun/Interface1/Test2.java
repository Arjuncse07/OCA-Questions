package com.arjun.Interface1;
interface Love{
    int x=10;
}
interface Fame{
    int x=10;
}
public class Test2 implements Love,Fame{
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(Left.x);
        System.out.println(Right.x);
    }
}
