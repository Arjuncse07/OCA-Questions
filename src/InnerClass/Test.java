package InnerClass;


class Outer{

    class Inner{
        public void m1(){
            System.out.println("Inside inner class");
        }
    }

}


public class Test {
    public static void main(String[] args) {
        Outer o1= new Outer();
        Outer.Inner i= o1.new Inner();
        i.m1();
    }
}
