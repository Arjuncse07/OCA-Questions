package Streams;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Employee{
    int empid;
    String empName;
    double empSalary;

    Employee(int empid, String empName, double empSalary){
        this.empid=empid;
        this.empName=empName;
        this.empSalary=empSalary;
    }
    Employee(){

    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public void showDetails(){
        System.out.println("Employee id"+empid);
        System.out.println("Employee Name"+empName);
        System.out.println("Employee Salary"+empSalary);
    }

}

public class Cls extends Employee{


    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(1,"Arjun",58545.25));
        employeeList.add(new Employee(2,"Ravi",23545.25));
        employeeList.add(new Employee(3,"Sumit",18545.25));
        employeeList.add(new Employee(4,"Karan",58545.25));
        employeeList.add(new Employee(5,"Aujila",2322.25));
        employeeList.add(new Employee(6,"Dalveer",325.25));
        employeeList.add(new Employee(7,"Simran",1545.25));
        employeeList.add(new Employee(8,"Kushpreet",1000.25));

        List<Double> employeeSalary= employeeList.stream()
                .filter( e -> e.empSalary < 10000)
                .map(e -> e.empSalary)
                .collect(Collectors.toList());

        System.out.println(employeeSalary);


        //Converting Product list into Map
        Map<Integer,String> employeeSalaryMap= employeeList.stream().collect(Collectors.toMap(e-> e.empid,e ->e.empName));
        System.out.println(employeeSalaryMap);

        //Count the number of employee based on the salary
        long countSalary = employeeList.stream()
                .filter( e -> e.empSalary< 10000)
                .count();
        System.out.println("Salary Count:"+countSalary);

        //Converting product List to set
//        Set<Double> employeeSalrayList= employeeList.stream()
//                .filter(employee -> employee.empSalary<10000)
//                .map(employee -> employeeSalary)
//                .collect(Collectors.toSet());
//        System.out.println(employeeSalrayList);

        //




   }
}
