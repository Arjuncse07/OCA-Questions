package com.arjun.oca2;
class Pen{

}
public class GarbageCollectionTest {

   public static void change(Pen pen){ //Line 5
    pen= new Pen();   //Line 6
   }
    public static void main(String[] args) {
        new Pen(); //Line 1
        Pen p = new Pen(); // Line 2
        change(p); //Line 3
        System.out.println("About to end."); //Line 4
    }
}
