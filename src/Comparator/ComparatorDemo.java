package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("amit",142,"new delhi"));
        studentsList.add(new Student("shiva",152,"New Mellenium City"));
        studentsList.add(new Student("ravi",50,"New Mellenium City"));
        studentsList.add(new Student("annu",141,"New Mellenium City"));

        // Comparator for comparing by name and then by marks
       /* Comparator<Student> nameAndMarksComparator = Comparator
                .comparing(Student::getName)
                .thenComparingInt(Student::getMarks); */

        // Comparator for comparing by name and then by marks in ascending order
        /* Comparator<Student> marksComparator  = Comparator
                .comparingInt(Student::getMarks); */

        //Sorting of marks based on descending order
       /* Comparator<Student> marksDescendingComparator  = Comparator
                .comparingInt(Student::getMarks).reversed(); */


        //Sort based on the names
        Comparator<Student> sortBasedOnNames = Comparator
                .comparing(Student::getName);

        //sort the list using comparator
        //studentsList.sort(nameAndMarksComparator);

        //studentsList.sort(marksComparator);

       // studentsList.sort(marksDescendingComparator);

        studentsList.sort(sortBasedOnNames);

        studentsList.forEach( list ->
                System.out.println(
                        "Name::"+list.getName()+"  Marks::"+list.getMarks()+
                                "  Address:::"+list.getAddress() ));
    }

}
