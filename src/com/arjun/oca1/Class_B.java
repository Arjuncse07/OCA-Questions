package com.arjun.oca1;

import com.arjun.oca.Class_A;

public class Class_B extends Class_A {
    public void print(){
        Class_A obj= new Class_A();
        System.out.println(obj.i1);
       // System.out.println(obj.i2);
        System.out.println(this.i2);
        System.out.println(super.i2);
    }

    public static void main(String[] args) {
        new Class_B().print();
    }
}
