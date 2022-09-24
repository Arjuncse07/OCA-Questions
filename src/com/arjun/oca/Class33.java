package com.arjun.oca;


public class Class33 {
    static int start=2;
    final int end;
    Class33(int x) {
        x = 4;
        end = x;
    }
    public void fly(int distance){
        System.out.println(end-start+" ");
        System.out.println(distance);
    }

    public static void main(String[] args) {
        new Class33(10).fly(5);
    }
        }
    