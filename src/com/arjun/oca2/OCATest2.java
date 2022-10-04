package com.arjun.oca2;
//Take a bit much special care
public class OCATest2 {
    public static void main(String[] args) {
       int i;
       int j=10;
       if(j<5)
       {
           j=j++;
       }
       else {
           j=j++;
           i=j--;
       }
       // System.out.println(i+":"+j); //i must be initialized
    }
}
