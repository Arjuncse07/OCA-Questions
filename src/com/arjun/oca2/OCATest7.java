package com.arjun.oca2;
//Take a bit much special care
//static is not a final will may we reassign in the program is possible.
class Demo1{
    int x;
    int y;
}
public class OCATest7 {
public void m1(Demo1 d){
    d.x=888;
    d.y=999;
    System.out.println("Inside method:"+d.x+":"+d.y);
}

    public static void main(String[] args) {
        Demo1 demo1= new Demo1();
        demo1.x=10;
        demo1.y=20;
        OCATest7 ocaTest7= new OCATest7();
        ocaTest7.m1(demo1);
        System.out.println("After completing method:"+demo1.x+":"+demo1.y);  //little bit tricky
    }
    }
