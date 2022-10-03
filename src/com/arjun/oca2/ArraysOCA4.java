package com.arjun.oca2;

/*** Valid Conversions Example
 * Primitives level assignments are not applicable for arrays.
 * In Case of Object type arrays they are easily to be promoted.
 * child type array is easily to be promoted to parent type array
 * A.char[]---> int[] Valid
 * B.char[]--->int   not valid
 * C.int---> long  valid
 * D.int[]-->long[]  valid ?
 * E.double--->float  valid ?
 * F.double[]-->float[]  valid ?
 * G.String---> object   valid
 * H.String[]-->object[]  valid
 * Correct or Valid are: A,C,G,H
 */
public class ArraysOCA4 {
    //String[] can be assign to object type array.
    public static void main(String[] args) {

        String[] ss = {"A", "B", "C", "D"};
        Object o = ss;

        //case:2 Which type of elements are allowed?
        Object[] aa = new String[3];
        //compiler always consider reference type object.
        //JVM always consider runtime object type.
        aa[0] = new Object();
    }
}
