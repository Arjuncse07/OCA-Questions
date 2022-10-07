package com.arjun.oca2;
//Take a bit much special care
//static is not a final will may we reassign in the program is possible.
public class OCATest5 {
    public void m1(int i, int j){
        i=i+10;
        j=j+20;
        System.out.println("Inside Method:"+i+ ":"+j);
    }

    public static void main(String[] args) {
        int i = 100;
        int j = 200;
        OCATest5 ocaTest5 = new OCATest5();
        ocaTest5.m1(i, j);
        System.out.println("After completing method:" + i + ":" + j);
    }}