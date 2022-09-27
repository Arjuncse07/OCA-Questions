package com.arjun.oca2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args)
    {
        List<String> l1= Arrays.asList(new String[] {"A","B"});
        List<String> l2= new ArrayList<>();
        l2.add("A");
        l2.add("B");
        if (l1==l2)
        {
            System.out.println("Equal By Address");
        }
        else if(l1.equals(l2))
        {
            System.out.println("Equal By Content");
        }
        else
        {
            System.out.println("Not Equal either by Address or by Content");
        }

    }
}
