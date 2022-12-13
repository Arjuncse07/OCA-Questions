package com.arjun.DailyCode;
class Student{
 private int sid;
 private String name;
 private static String course;

 //Provide Getters and Setter
    public void setSid(int sid){
        this.sid=sid;
    }
    public int getSid(){
        return sid;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
   public static String getCourse(){
        return course;
   }
   public  static void setCourse(String course){
        Student.course=course;
   }
}
public class CodeJava {
    public static void main(String[] args) {
      Student student=new Student();
        System.out.println(student.getName()+"====="+student.getSid()+"==="+student.getCourse());
        System.out.println("==============================================================");

        student.setName("Arjun");
        student.setSid(1);
        student.setCourse("Java");

        System.out.println("==========================================================");
        Student student1= new Student();
        student1.setSid(2);
        student1.setName("Manish");
        student1.setCourse("React JS");
        System.out.println(student.getName()+"====="+student.getSid()+"==="+student.getCourse());

        Student student2=student1;
        Student student3= student2;

        if(student3==student2){
            System.out.println(student.getCourse());
        }
        else {
            System.out.println("Else-Block Executed");
        }

        if(student.equals(student1)){
            System.out.println("S1 equal to S2");
            //System.out.println(student1.getCourse());
        }
        else{
            System.out.println("else2");
        }

    }
}
