package com.arjun.DailyCode;
/*
Write a code to print duplicate count of the EmployeesList

EMPID   NAME     DEPT   AGE
-----------------------------------------
'E23231' 'PRADEEP' 'HR'   32
'E32422' 'FERL KING'  'DEV' 35
'E21323' 'CHRIS BUMSTEAD' 'HR' 45
'E23211'  'DOLLY' 'DEV'   35

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class  Employee{
    String id;
    String name;
    String dept;
    int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Employee(String id, String name, String dept, int age){
        super();
        this.id=id;
        this.name=name;
        this.dept= dept;
        this.age=age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", age=" + age +
                '}';
    }
}


public class CodingChalllege {
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>();
        list.add(new Employee("E23231" ,"PRADEEP", "HR",   32));
        list.add(new Employee("E32422", "FERL" ,"HR" ,  35));
        list.add(new Employee("E21323", "CHRIS" ,"HR", 45));
        list.add(new Employee("E21323", "CHRIS" ,"HR", 45));
        list.add(new Employee("E23211",  "DOLLY_DEV" , "DEV", 35));
        list.add(new Employee("E21323", "CHRIS" ,"HR", 45));
        list.add(new Employee("E21323", "CHRIS" ,"HR", 45));
        list.add(new Employee("E23231" ,"PRADEEP", "HR",   32));
        list.add(new Employee("E23231" ,"PRADEEP", "HR",   32));

        Map<String,Integer> mapCount= new HashMap<>();
        for (Employee employee: list){
            if (!mapCount.containsKey(employee.getName())){
                mapCount.put(employee.getName(),1);

            }else {
                mapCount.put(employee.getName(),mapCount.get(employee.getName())+1);
            }
        }
        System.out.println(mapCount);
    }
}
