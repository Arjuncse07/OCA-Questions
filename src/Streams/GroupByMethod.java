package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
author : @Arjun_Singh
Please refer to the Cls.java File to Understand the GroupByMethod of Streams
 */

public class GroupByMethod extends Employee {

    public static void main(String[] args) {

     //Employee employee = new Employee();

        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee(1,"Arjun",10000.00,
                "arjun@gmail.com","DTS(Defence Travel System"));
        employeeList.add(new Employee(2,"Ravi",
                15000.00,"ravisona@rediffmail.com","CGDA(Controller General Of Defence Accounts)"));
        employeeList.add(new Employee(3,"Sumit",
                16000.00,"sumit124@gmail.com","CGDA(Controller General Of Defence Accounts)"));
        employeeList.add(new Employee(4,"Karan",
                78000.00,"karan12@rediffmail.com","CGDA(Controller General Of Defence Accounts)"));
        employeeList.add(new Employee(5,"Aujila",
                35000.00,"Ahujua@rediffmail.com","DTS(Defence Travel System"));
        employeeList.add(new Employee(6,"Dalveer",
                25000.00,"dalveeer12@gmail.com","APS(Army Postal Service)"));
        employeeList.add(new Employee(7,"Simran",
                18000.00,"simran123@gmail.com","MNS(Ministry Nursing Services)"));
        employeeList.add(new Employee(8,"Kushpreet",
                19000.00,"kushpreetSingh123@gmail.com","DTS(Defence Travel System"));
        employeeList.add(new Employee(9,"Simranjeet Singh",
                10000.00,"simranjeet@gmail.com","DTS(Defence Travel System"));
        employeeList.add(new Employee(10,"Umesh Chandra",
                15000.00,"umeshchndra@gmail.com","APS(Army Postal Service)"));
        employeeList.add(new Employee(11,"Upendra Kumar",
                25000,"umeshchandra@rediffmail.com","APS(Army Postal Service)"));
        employeeList.add(new Employee(12,"Sonu Kumar",
                25000.10,"sonutechtreeit@gmail.com","DSC(Defence Security Corps)"));
        employeeList.add(new Employee(13,"Chirenjive Kumar",
                20000.10,"sonutechtreeit@gmail.com","DSC(Defence Security Corps)"));

  /*
         // AVERAGE USING GROUP_BY BY STREAMS TO FIND OUT THE AVERAGE SALARY BY DEPARTMENT

        Map<String,Double> averageSalaryByDepartment = employeeList
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getEmpDepartment,
                        Collectors.averagingDouble(Employee::getEmpSalary)
                ));


        averageSalaryByDepartment.forEach(
                (department, averageSalary) ->
                        System.out.println(department + ": Rs:" +averageSalary)
        );
*/
       //Group Employees by Department

       Map<String, List<Employee>> employeesByDepartment = employeeList
               .stream()
               .collect(Collectors.groupingBy(
                       Employee::getEmpDepartment
               ));

       employeesByDepartment.forEach(
               (department, employeeFilteredList) ->
                       System.out.println(department + ": "+employeeFilteredList)
       );



    }
}
