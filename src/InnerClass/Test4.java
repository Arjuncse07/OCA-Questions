package InnerClass;
// we access the local variable of the method in which we
// declare the method local inner class. But we can access why?
public class Test4 {

    public void m1(){
      int x=444;

        class Inner1{
            public void m2(){
                System.out.println(x);
            }
        }

        Inner1 inner1= new Inner1();
        inner1.m2();
    }

    public static void main(String[] args) {
        Test4 test4= new Test4();
        test4.m1();
    }
}
