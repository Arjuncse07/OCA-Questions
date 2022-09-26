package com.arjun.DataTypes;

public class DataTypesEx3 {
    public static void main(String[] args) {
        double d = 123.456;    //VALID
        double d1 = 0123.456;   //VALID
        //double d2 = 0X123.3434;  //INVALID
        //Assining integral Literal to the floating point variables
        double d3=0XFACE;     //VALID
        double d4=0777;       //VALID
       // double d5=0780;      //INVALID because
        double d6=0768.0;     //VALID
        double d7=10.0;
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d6);
    }
}
