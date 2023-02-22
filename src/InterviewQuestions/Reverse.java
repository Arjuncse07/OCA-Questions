package InterviewQuestions;

public class Reverse {

    public static void main(String[] args) {
        int number= 54321;
        int reverse=0;

        while(number != 0){
            int remainder= number % 10;
            reverse= reverse*10 + remainder;
            number= number/10;
        };

        System.out.print(reverse);
    }

}

