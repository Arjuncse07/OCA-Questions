package com.arjun.oca2;
public class ArraysDemoSyntax1 {
    public static void main(String[] args) {
        double[] d= new double[3];
        int j=3;
        for (int i=0; i<j; i++){
            d[i]=i;
        }
        for (double d1:d
             ) {
            System.out.println(d1);
        }
    }
}
