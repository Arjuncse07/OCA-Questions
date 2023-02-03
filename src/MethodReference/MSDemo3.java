package MethodReference;

import java.util.Arrays;

public class MSDemo3 {

    public static void main(String[] args) {

        String[] names= {"Arjun","Sumit","Ravi","Taneja","Suneja","Dolly","Fool","Simran"};

        Arrays.sort(names, String::compareToIgnoreCase);
        for (String str: names) {
            System.out.println(str);
        }
    }
}
