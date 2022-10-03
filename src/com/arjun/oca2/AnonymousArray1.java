package com.arjun.oca2;
public class AnonymousArray1 {
    public static void sum(int[] x){
        int total=0;
        for (int x1:x) {
            total=total+x1;
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        //just to call a method we required an array, after that there is no use for that array, here we can use anonymous array.
       AnonymousArray1.sum(new int[]{12,30,30}); //create anonymous array
        sum(new int[]{20,30,40});
    }
}
