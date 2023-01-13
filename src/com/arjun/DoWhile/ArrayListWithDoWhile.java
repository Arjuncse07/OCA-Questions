package com.arjun.DoWhile;

import java.util.ArrayList;

public class ArrayListWithDoWhile {
    public static void main(String[] args) {
        ArrayList<String> arrayList1= new ArrayList<String>();
        try {
            while (true)
            {
             arrayList1.add("Apple");
            }
        }
        catch (OutOfMemoryError e){

            System.out.println("Error Handled Successfully");
        }
        System.out.println("Still i am creating some more objects");
        for (int i=0; i<100; i++){
            ArrayListWithDoWhile arrayListWithDoWhile= new ArrayListWithDoWhile();
            System.out.println(arrayListWithDoWhile);
        }
    }
}
