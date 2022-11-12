package com.arjun.oca2;
interface I5{

}
abstract class AC1{

}

class A{

}
abstract  class Abs_cls extends A implements I5 {

    int a=111;
    int b;
    public int c;
    private int d;
    protected int e;

    abstract void m1();
    void m2() {

    };
    private void m3() {

    };
    protected void m4() {

    };
    final void m5() {

    };
     //init block of static method
    {
        System.out.println("Init Block of the abstact class");
    }
    //static block of the abstactact class
    static {
        System.out.println("Static abstract");
    };
    public static void main(String[] args) {
        System.out.println("Yes this is an abstact class");
    }


    //Define constructor inside the abstract class
    public Abs_cls() {

    }

    //We can't create an object of the abstract class
    //Abs_cls obj= new Abs_cls();


    //we can instantiate the object of the abstract class
    Abs_cls obj;

}


/*
 * 1.Before class keyword we need to declare abstract keyword.
 * 2.abstract class can participated in inheritance either through
 * class, abstract class, interface.
 * 3.abstract class we can able to initialize and declare variables.
 * 4.in abstract class we can able to write private and protected variables.
 * 5.we can write abstract and concrete methods.
 * 6.by default abstract class methods are not abstract.
 * 7.Whenever we declare method in abstract method in abstract class we need
 *  to declare that method with abstract keyword.
 * 8.we can able to write private, protected,public, final,static,default method.
 * 9.we can able to write static, non-static blocks and constructor.
 * 10. we can compile and execute abstract class program individually by using main
 * method.
 *
 * 11. we can't instantiated the abstract class.
 *  we can't object
 *
 * 12. we can create the reference of the object.
 * 13.by the help of the abstract class reference variables we need
 * its sub-class memory/object.
 */





