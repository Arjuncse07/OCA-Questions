package InnerClass;

public class Test3 {
    int x=10;
    static int y=20;
    public  void methodOne(){
        class Inner{
            public  void  methodTwo(){
                System.out.println(x);
                System.out.println(y);
            }
        }
        Inner i =new Inner();
        i.methodTwo();
    }

    public static void main(String[] args) {
        new Test3().methodOne();
    }

}
