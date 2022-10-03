package com.arjun.oca2;

public class TestOca {
    String name;
    int age;
    public void modify(TestOca y){
        y.name="Arjun";
        y.age=25;
    }

    public static void main(String[] args) {
        TestOca testOca= new TestOca();
        testOca.name="c++";
        testOca.age=25;
        testOca.modify(testOca);
        System.out.println(testOca.name+ " "+testOca.age);
    }
    }
