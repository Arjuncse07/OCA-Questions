package InterviewQuestions;

public class Palindrom {

    public static void main(String[] args) {
        int  number= 565;
        int reverse =0;

        while ( number != 0){
            int remainder= number %10;
            reverse= reverse *10 + remainder;
            number= number/10;
        }

        int number1= 565;
        if(number1 == reverse){
            System.out.println("Number is palindrom");
        }else{
            System.out.println("Not a palindrom");
        }
    }

}
