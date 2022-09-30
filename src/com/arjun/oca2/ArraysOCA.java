package com.arjun.oca2;

public class ArraysOCA {
    public static void main(String[] args) {
        int[][] evenodd= new int[2][2];  //create 2D Array
        for (int i=0; i<2&i%2==0;i++){
            for(int j=0; j<2; j++){
                evenodd[i][j]=j;
            }
        }
        for (int i=0; i>2 &i%2 !=0; i++){
            for(int j=0; j<2; j++){
                evenodd[i][j]=i;
            }
        }
        for (int[] x: evenodd
             ) {
           for (int y:x){
               System.out.print(y);
           }
        }
    }
}
