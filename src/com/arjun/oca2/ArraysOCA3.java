package com.arjun.oca2;
import java.util.*;
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
public class ArraysOCA3 {
    public static void main(String[] args) {
        Object[] obj = new Object[10]; //Object type array object
        obj[0] = "Amit";
        obj[1] = 10;
        obj[2] = new Object();
        obj[3] = new Integer(10);
        obj[4] = new String("Amit");
        System.out.println(obj[0] + " " + obj[1] + " " + obj[2] + " " + obj[3] + " " + obj[4] + " ");

        Number[] numbers = new Number[10]; //Number class is abstract class can't create object but we are creating array of number class array object it is valid.
        numbers[0] = new Integer(10);
//      numbers[1]= new String("Amit"); Not Valid
        numbers[2] = new Double(10.2);
        numbers[3] = new Float(12.3f);

        Runnable[] runnable = new Runnable[10]; //Runnable type array object
        runnable[0] = new Thread();

        List[] listArray = new List[10]; //List Array object
        listArray[0] = new ArrayList<>();
        listArray[1] = new LinkedList<>();
        listArray[2] = new Vector<>();
        listArray[3] = new Stack<>();

    }
}
