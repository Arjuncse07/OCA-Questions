package com.arjun.oca;
public class Class35 {
      public static int yesterday=1;
      int tomorrow=10;
      int n,t;
      public  void show(){
         n=yesterday;
         t=tomorrow;
          System.out.println(n+t);
      }

    public static void main(String[] args) {
        Class35 class35= new Class35();
        class35.show();
        int today=20, tomorrow=40;
        System.out.println(today + yesterday+ class35.tomorrow + tomorrow);
    }
    }

    