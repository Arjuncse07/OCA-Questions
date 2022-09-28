package com.arjun.oca2;
class Student{

}
public class BooleanTest5 {
    public static void main(String[] args) {
        //boolean b1=0;  boolean default value will be false
        boolean[] b= new boolean[10];
        System.out.println(b.getClass().getName());  //Z

        byte[] b1= new byte[10];
        System.out.println(b1.getClass().getName());  //B

        int [] i= new int[10];
        System.out.println(i.getClass().getName()); //I

        char[] ch= new char[10];
        System.out.println(ch.getClass().getName()); //C

        short[] sh= new short[10];
        System.out.println(sh.getClass().getName());  //S

        Student[][] s1= new Student[2][3];
        System.out.println(s1.getClass().getName());  // [[Lcom.arjun.oca2.Student;
    }
}
