package com.arjun.oca2;

public class ArraysOCA1 {
    static int[] x;

    public static void main(String[] args) {
        // x={10,20,30,40};   initilization is not Valid
        // x= new int[3];    //Valid
       //  x= new int[3]{10,20,30};  //Compile Time Error
        x= new int[]{10,20,30}; //Valid Declaration

    }
}
