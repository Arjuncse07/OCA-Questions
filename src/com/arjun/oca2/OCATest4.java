package com.arjun.oca2;
//Take a bit much special care
//static is not a final will may we reassign in the program is possible.
public class OCATest4 {
    static int i;
    public static void main(String[] args) {
       int j=10;
       if(j<5){
           j=++j;
       }else{
           j=++j;
           System.out.println("J="+j);
           i=--j;
           System.out.println("I="+i);
       }
        System.out.println("i is:"+i+"  "+"j is:"+j);
        System.out.println(i+j);
    }
}
