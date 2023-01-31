package InnerClass;

public class Test5 {
    int i=10;
    static int j=20;

    public  void method1(){
        int k=30; // why it will be access in method local inner class?
        final int m=40;
         // can't declare static members inside inner class.
        class InnerClass{
            public  void method2(){
                System.out.println(i);
                System.out.println(j);
                System.out.println(k);
                System.out.println(m);
            }
        }
        InnerClass innerClass= new InnerClass();
        innerClass.method2();
    }

    public static void main(String[] args) {
        Test5 test5= new Test5();
        test5.method1();
    }
}
