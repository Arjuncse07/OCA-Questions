package InterviewQuestions;

import java.util.Arrays;

public class DuplicateArrayCheck2 {

    public static boolean arraysEqual(int[] arr1, int[] arr2){

       Arrays.sort(arr1);
       Arrays.sort(arr2);

       boolean returnValue1=Arrays.equals(arr1,arr2);
        System.out.println("Array arr1 and arr2 are equal:" +returnValue1);

        return true;
    }
    public static void main(String[] args) {

        int[] arr1={3,5,2,5,2};
        int[] arr2={2,3,5,6,2};

        //Check if the two arrays are duplicate or not?

       arraysEqual(arr1, arr2);

    }
}
