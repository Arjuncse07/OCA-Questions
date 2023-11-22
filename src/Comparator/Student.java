package Comparator;

public class Student {

    private String name;
    private int marks;

    private String address;


    //constractor Student
    public Student(String name, int marks, String address){
        this.name= name;
        this.marks = marks;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
