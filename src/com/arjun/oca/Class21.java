package com.arjun.oca;


import java.util.ArrayList;
import java.util.List;

class Student1{
    private String name;
    private  int age;

    Student1(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "Student1["+ name +"," +age+ "]" ;
    }

}

public class Class21 {
    public static void main(String[] args) {
        List<Student1> students= new ArrayList<>();
        students.add(new Student1("James",25));
        students.add(new Student1("James",27));
        students.add(new Student1("James", 25));
        students.add(new Student1("James",25));
        students.remove(new Student1("James",25));

        for(Student1 str:students){
            System.out.println(str);
        }
    }
}
