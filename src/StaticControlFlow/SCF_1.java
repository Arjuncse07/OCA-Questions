package StaticControlFlow;

public class SCF_1 {
    public static void main(String[] args) {
        print();
        System.out.println("Inside main method");
    }
    static int a=100;
    static {
        System.out.println(a);
        print();
        System.out.println("Inside First static block");
    }

    public static void print(){
        System.out.println(b);
    }

    static
    {
        System.out.println("Second static block");
    }
    static int b=200;
}
