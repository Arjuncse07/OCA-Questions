package com.arjun.oca;

public class Class4 {
    public static void main(String[] args) {
       //replace args with args1 because variable args is already define in main method
        short [] args1= new short[]{50,50};
        args1[0]=5;
        args1[1]=10;
        System.out.println("["+args1[0]+ ","+args1[1]+"]");
    }
}
