package com.arjun.oca1;
class BaseHunting {
    public BaseHunting() {
        System.out.println("Base ");
    }

    public BaseHunting(String s) {
        System.out.print("Base: " + s);
    }
}
 class Hunting extends  BaseHunting {
     Hunting(String s){
        super("sumit mehta::");
        System.out.println("Hunting cons");
    }
}
public class HuntingJava {
    public static void main(String[] args) {
        BaseHunting baseHunting= new Hunting("Hello Hunting");
    }
}
