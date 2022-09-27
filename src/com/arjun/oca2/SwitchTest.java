package com.arjun.oca2;

public class SwitchTest {
    public static void main(String args[]) {
        int num = 20;
        final int num2;
        num2 = 20;
        switch (num) {
            default:
                System.out.println("default");
            //case num2:   not valid because num2 is not a constant expression
                System.out.println(4);
                break;
        }
    }
}
