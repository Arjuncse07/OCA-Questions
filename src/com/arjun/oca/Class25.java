package com.arjun.oca;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class  Employee{
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class Class25 {

    private static void process(List<Employee> list, Predicate<Employee> predicate){
        Iterator<Employee> iterator =list.iterator();
        while(iterator.hasNext()){
            if (predicate.test((iterator.next()))){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>();
        list.add(new Employee("James",25,15000));
        list.add(new Employee("Lucky",26,12000));
        list.add(new Employee("Bill",29,10000));
        list.add(new Employee("Jack",25,5000));
        list.add(new Employee("Liya",20,8000));

        process(list,e-> e.getSalary() >=10000);

        System.out.println(list);
    }
}
