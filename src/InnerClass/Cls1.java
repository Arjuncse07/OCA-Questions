package InnerClass;

public class Cls1 {

    class Inner{
     public void m1(){
         System.out.println("Inner class Method");
     }
    }

    public static void main(String[] args) {

        Cls1 outerObject= new Cls1();
        Cls1.Inner innerObject=  outerObject.new Inner();

        innerObject.m1();
                                     //OR


        Cls1.Inner i= new Cls1().new Inner();

        new Cls1().new Inner().m1();

    }
}
