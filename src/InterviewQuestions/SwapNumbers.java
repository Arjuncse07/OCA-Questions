package InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SwapNumbers {

    public static int[] swapNumber(int[] number){


        if (number.length !=0 & number != null){
            System.out.println("Numbers are valid");
        }

        for (int i=0; i<number.length; i++){
            for (int j=i+1; j<number.length; j++){
                int temp=0;
                if (number.length != 0){
                    temp = number[i];
                    number[i] = number[j];
                    number[j]= temp;
                }
            }
        }
        return number;
    }
    public static void main(String[] args) {
        int[] number= {5,4};
        number.toString();
        swapNumber(number);
    }
}
