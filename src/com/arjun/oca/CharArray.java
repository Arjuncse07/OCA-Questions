package com.arjun.oca;

public class CharArray {
    public static void main(String[] args) {

        String str= "Arjun Singh";
        char array[] = new char[15];

        str.getChars(0,10,array,0);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[6]);
        System.out.println(array[7]);
        System.out.println(array[8]);
        System.out.println(array[9]);
        System.out.println(array[10]);


    }
}
