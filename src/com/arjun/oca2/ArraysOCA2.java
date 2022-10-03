package com.arjun.oca2;
/**
 * Types af Array are:
 * -----------------------------------------------
 * 1.primitive type
 * 2.object type
 * 3.abstract class type
 * 4.interface type: implemented class objects
 * Array Element Assignments
 * -----------------------------------------------
 * case:1 Primitive Arrays
 * Type Promotion of the primitive DT's (Data Types)
 * byte-->short-->int-->long-->float-->double
 * char------>int
 * Case:2 Object Type Arrays
 */
public class ArraysOCA2 {
    public static void main(String[] args) {
        int[] x = new int[5];
        x[0] = 100;
        x[1] = 'a';
        x[2] = 0;
//        x[3]=10L; Not Valid long!= promote to int
        float[] f = new float[10];
        f[0] = 10;
        f[1] = 'a';
        f[2] = 10L;
        f[3] = 10.5f;
//        f[4]=65.7; double can't be promoted to float
    }
}
