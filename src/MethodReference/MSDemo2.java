package MethodReference;
/*
  methodOfInterface() will use the implementation of the m1() defined in MSDemo2() class. Improves the reusebility of the method.
 */
interface Display{
     void methodOfInterface();
}
public class MSDemo2 {
    public void m1() {
        System.out.println("Method of MSDemo2 class");
    }

    public static void main(String[] args) {
        MSDemo2 msDemo2 = new MSDemo2();
        Display display = msDemo2::m1;

        display.methodOfInterface();
    }
}
