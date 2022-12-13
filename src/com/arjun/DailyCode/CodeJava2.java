package com.arjun.DailyCode;
class Parent{
    private  int age;
    private String name;
    //Why we have to provide default cons.

    /***
     * Compiler will provide default constructor
     * syntax of the default constructor is:
     *   Parent(){
     *    super();
     *   }
     *
     */
    public Parent(){

    }
    public Parent(int age, String name){
        this.age=age;
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void parentPrint(){
        System.out.println(getName()+"--"+getAge());
    }
}
class Child extends Parent{
    private int age;
    private String name;
    //parameterised cons
    public Child(int age, String name){
        super(age,name);
    }
    public void parentPrint() {
        System.out.println(getName() + "==" + getAge());
    }
    //default cons
    public Child(){
    this(10,"amit");
    }
    public void childPrint(){
        parentPrint();
    }
}
public class CodeJava2 {
    public static void main(String[] args) {
        Child child= new Child();
        child.childPrint();
        child.parentPrint();
        System.out.println("=====================");
        Parent parent= new Child(); //runtime polymorphism
        parent.parentPrint();
        System.out.println("===================");
        Parent parent1= new Parent();
        parent1.parentPrint();
    }
}
