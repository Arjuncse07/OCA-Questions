package com.arjun.oca;
class Student {
    String name;
    int age;

    void Student() {
        Student("James", 25);
    }
    void Student(String name, int age){
        this.name=name;
        this.age=age;
    }
}
public class Class13 {
    public static void main(String[] args) {
        Student s= new Student();
        System.out.println(s.name+":"+s.age);
    }
}
