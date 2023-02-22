package InterviewQuestions;

import java.util.Arrays;

public class DuplicateArrayCheck {

    public static boolean arraysEqual(int[] arr1, int[] arr2){

        if (arr1 == arr2){
            return true;
        }
        if (arr1.length != arr2.length  ){
            return false;
        }

        for(int i=0; i<arr1.length; i++){

            if (arr1[i] != arr2[i]){
                return false;
            }else {
                return true;
            }

        }
        return true;
    }
    public static void main(String[] args) {

        int[] arr1={3,5,2,5,2};
        int[] arr2={3,3,5,6,2};

        //Check if the two arrays are duplicate or not?

        if (arraysEqual(arr1, arr2)){
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Arrays are not Equal");
        }

    }
}
