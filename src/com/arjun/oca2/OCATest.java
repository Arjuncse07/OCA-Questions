package com.arjun.oca2;
//Take a bit much special care
public class OCATest {
    public static void main(String[] args) {
        int x;
        //case:1
        if(args.length>0){
            x=10;
        }
        //System.out.println(x); //variable can't be assigned
        //case:2
        else {
            x=20;
        }
        System.out.println(x);
    }
}
