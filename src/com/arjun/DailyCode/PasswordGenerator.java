package com.arjun.DailyCode;

import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
       // String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String number="0123456789";
        String combination=lower+number;
        int length=10;

        Random random= new Random();
        char[] password=new char[length];
        for (int i=0;i<length; i++){
            password[i]=combination.charAt(length);
        }
        System.out.println("Password Generated::"+password);


    }
}
