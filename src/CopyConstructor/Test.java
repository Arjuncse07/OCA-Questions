package CopyConstructor;

public class Test {
    int id;
    String name;

    Test(int id, String name){
        this.id=id;
        this.name=name;
    }

    Test(Test copyTestObject){
        id=copyTestObject.id;
        name= copyTestObject.name;
    }

    void display(){
        System.out.println(id +" : "+name);
    }

    public static void main(String[] args) {
        Test test= new Test(1,"Arun");
        Test test1= new Test(test);

        test.display();

         test1.id=2;
         test1.name="Dolly";
        System.out.println("After chaing the value of instance member of the copy object");
        test1.display();

    }
}
