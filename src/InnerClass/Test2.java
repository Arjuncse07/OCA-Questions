package InnerClass;

public class Test2 {
    public void m1(){

        class Inner
        {
            public void sum(int x, int y){
                System.out.println("The Sum:"+(x+y));
            }
        }
        Inner inner= new Inner();
        inner.sum(10,20);
        ;;;
        inner.sum(20,30);
        ;;;
        inner.sum(40,50);

    }

    public static void main(String[] args) {
        Test2 test2= new Test2();
        test2.m1();
    }
}
