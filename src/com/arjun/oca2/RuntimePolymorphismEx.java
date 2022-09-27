package com.arjun.oca2;
class Shape {
    void print() {
        System.out.println("Shape - A");
    }
}
class Rectangle extends Shape {
    void print() {
        System.out.println("Rectangle - B");
    }
}
public class RuntimePolymorphismEx {
    public static void main(String[] args) {

        Shape a = new Shape();
        // INSERT CODE HERE
        Rectangle b= new Rectangle();
        Shape b1= new Rectangle(); //Called Runtime Polymorphism or Overriding
        a.print();
        b.print();
        b1.print();
    }
}
