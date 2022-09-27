package com.arjun.oca2;

public class LoopsTest {
    public static void main(String args[]) {
        int i = 0;
        for (; i < 2; i = i + 5) {
            if (i < 5)
                continue;
            System.out.println(i);
        }
        System.out.println(i);
    }
}
/***
 * The following line of code has no compilation errors:
 *
 *  for (; i < 2; i=i+5) {
 * Using the initialization block is optional in a for loop.
 *
 * In this case, using a semicolon (;) terminates it.
 *
 * For the first for iteration, the variable i has a value of 0.
 *
 * Because this value is less than 2, the following if construct evaluates to true and the continue statement executes:
 *
 * if (i < 5) continue;
 * continue statement ignores all of the remaining statements in a for loop iteration, the control doesn't print the value of the variable i, which leads the control to move on to the next for iteration.
 *
 * In the next for iteration, the value of the variable i is 5. The for loop condition evaluates to false and the control moves out of the for loop.
 *
 * public class Main {
 *   public static void main(String args[]) {
 *     int i = 0;/*from   w w  w.  j  a  v a2  s . co  m
 *for(;i< 2;i=i+5){
        *if(i< 5)
        *continue;
        *System.out.println(i);
        *}
        *System.out.println(i);
        *}
        *}
 */