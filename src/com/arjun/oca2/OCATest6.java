package com.arjun.oca2;
//Take a bit much special care
//static is not a final will may we reassign in the program is possible.
public class OCATest6 {
int x;
public int  m1(int x){
    this.x=this.x+x*x;
    return x;
    }

    public static void main(String[] args) {
        int x=10;
        OCATest6 ocaTest6= new OCATest6();
        System.out.println(ocaTest6.m1(x)+":");
        System.out.println(ocaTest6.m1(x)+":");
        System.out.println(ocaTest6.x+x);
    }
    }