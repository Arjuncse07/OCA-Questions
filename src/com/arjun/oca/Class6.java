package com.arjun.oca;

public class Class6 {
    private static  void m(int x){
        System.out.println("int version");
    }
    private  static  void m(char x){
        System.out.println("char version");
    }

    public static void main(String[] args) {
        int i='A';
        m(i);
        m('2');

    }
}
