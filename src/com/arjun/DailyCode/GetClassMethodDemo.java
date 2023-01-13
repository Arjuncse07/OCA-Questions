package com.arjun.DailyCode;

import java.lang.reflect.Method;

public class GetClassMethodDemo {
    public static void main(String[] args) {
        int count=0;
        Object o = new String("Arjun");
        Class c= o.getClass();

        System.out.println("Fully Qualified Name of the class:"+c.getClass());

        Method[] m= c.getDeclaredMethods();
        System.out.println("Method Information:");

        for (Method m1:m) {
            count++;
            System.out.println(m1.getName());
        }
        System.out.println("The number of Method:"+count);
    }

}
