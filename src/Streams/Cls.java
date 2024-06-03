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

    String empDepartment;

    String email;

    Employee(int empid, String empName, double empSalary,String email,String empDepartment){
        this.empid=empid;
        this.empName=empName;
        this.empSalary=empSalary;
        this.email= email;
        this.empDepartment = empDepartment;
    }
    Employee(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getEmpDepartment(){
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment){
        this.empDepartment = empDepartment;
    }

    public void showDetails(){
        System.out.println("Employee id"+empid);
        System.out.println("Employee Name"+empName);
        System.out.println("Employee Salary"+empSalary);
        System.out.println("Employee Email "+email);
        System.out.println("Employee Department"+empDepartment);
    }


    //Method to return type of email Provider
    public String getEmailProvider(Employee employee){
        return employee.getEmail().split("@")[1];
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empDepartment='" + empDepartment + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class Cls extends Employee{

    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(1,"Arjun",58545.25,"arjun@gmail.com","DTS(Defence Travel System"));
        employeeList.add(new Employee(2,"Ravi",23545.25,"ravisona@rediffmail.com","CGDA(Controller General Of Defence Accounts)"));
        employeeList.add(new Employee(3,"Sumit",18545.25,"sumit124@gmail.com","CGDA(Controller General Of Defence Accounts)"));
        employeeList.add(new Employee(4,"Karan",58545.25,"karan12@rediffmail.com","CGDA(Controller General Of Defence Accounts)"));
        employeeList.add(new Employee(5,"Aujila",2322.25,"Ahujua@rediffmail.com","DTS(Defence Travel System"));
        employeeList.add(new Employee(6,"Dalveer",325.25,"dalveeer12@gmail.com","APS(Army Postal Service)"));
        employeeList.add(new Employee(7,"Simran",1545.25,"simran123@gmail.com","MNS(Ministry Nursing Services)"));
        employeeList.add(new Employee(8,"Kushpreet",1000.25,"kushpreetSingh123@gmail.com","DTS(Defence Travel System"));
        employeeList.add(new Employee(9,"Simranjeet Singh",25700.00,"simranjeet@gmail.com","DTS(Defence Travel System"));
        employeeList.add(new Employee(10,"Umesh Chandra",165700.50,"umeshchndra@gmail.com","APS(Army Postal Service)"));
        employeeList.add(new Employee(11,"Upendra Kumar",145470.50,"umeshchandra@rediffmail.com","APS(Army Postal Service)"));
        employeeList.add(new Employee(12,"Sonu Kumar",741000.10,"sonutechtreeit@gmail.com","DSC(Defence Security Corps)"));
        employeeList.add(new Employee(13,"Chirenjive Kumar",158700.10,"sonutechtreeit@gmail.com","DSC(Defence Security Corps)"));


        List<Double> employeeSalary= employeeList.stream()
                .filter( e -> e.empSalary < 10000)
                .map(e -> e.empSalary)
                .collect(Collectors.toList());

        System.out.println(employeeSalary);


        //Converting Product list into Map
        Map<Integer,String> employeeSalaryMap= employeeList
                .stream()
                .collect(Collectors.toMap(e-> e.empid,e ->e.empName));
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


        //Group users by email and count each email provider.
       Map<String,Long>  employeeEmailCountMap = employeeList.stream()
               .collect(
                       Collectors.groupingBy(
                           employee -> employee
                                   .getEmailProvider(employee), Collectors.counting()
                       )
               );

        System.out.println(employeeEmailCountMap);


   }
}
