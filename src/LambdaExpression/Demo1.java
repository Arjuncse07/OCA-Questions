package LambdaExpression;

interface  MathOperation{
    int operation(int a , int b);
//    int squareOperation(int a);
}
public class Demo1 {

    private static int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }

    public static void main(String[] args) {
    MathOperation addition=(a,b) -> a+b;
    MathOperation subtraction= (a,b) -> a-b;
    MathOperation division= (a,b )-> a/b;
    MathOperation multiplication = (a,b) -> a*b;

    MathOperation square = (a,b) -> a*a;

        System.out.println("10+5 =" +operate(10,5,addition));
        System.out.println("10-5 =" +operate(10,5,subtraction));
        System.out.println("10/5 =" +operate(10,5,division));
        System.out.println("10*5 =" +operate(10,5,multiplication));
        System.out.println("10*10 =" +operate(10,10,square));
    }
}
