package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {

        List<Student> listofStudent = new ArrayList<>();
        listofStudent.add(new Student("Sundar",50));
        listofStudent.add(new Student("Amit",25));
        listofStudent.add(new Student("Ravi",14));
        listofStudent.add(new Student("Sumit",10));
        listofStudent.add(new Student("Xaiver",5));

        Collections.sort(listofStudent);

        listofStudent.forEach(list -> System.out.println("Name::"+list.getName() + "  Age::"+list.getAge()));

    }
}
