package com.arjun.oca2;
//Autowala why you email Id and mobilenumber : this is concept behind anonymous arrays.
public class AnonymousArray {
    public static void main(String[] args) {
        //arrays without name is called anonymous arrays/ without any reference variable
        new int[] {10,20,30};  //valid
        new int[3]{12,20,30}; //invali d
        new int[][] {{10,20,30},{20,30,40}}; //invalid
    }


}
