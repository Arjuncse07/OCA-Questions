package CopyConstructor;

public class Student {

    int student_id;
    String student_name;
    String student_FatherName;
    String student_MotherName;
   //parametrised Constructor
    Student(int student_id, String student_name, String student_FatherName, String student_MotherName){
        this.student_id=student_id;
        this.student_name= student_name;
        this.student_FatherName=student_FatherName;
        this.student_MotherName=student_MotherName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", student_FatherName='" + student_FatherName + '\'' +
                ", student_MotherName='" + student_MotherName + '\'' +
                '}';
    }

    //CopyConstructor
    Student(Student student){
        student_name= student.student_name;
        student_id= student.student_id;
        student_FatherName= student.student_FatherName;
        student_MotherName= student.student_MotherName;
    }

    public static void main(String[] args) {
        System.out.println("New Object Created");
        Student student1= new Student(1,"Arjun","XYZ","ZXS");

        System.out.println(student1 +"::HashCode:"+student1.hashCode());
        System.out.println("Copy Object by using CopyConstructor");
        Student student2= new Student(student1);
        System.out.println(student2 +"::HashCode:"+student2.hashCode());
    }
}
