package InterviewQuestions;

import java.util.Arrays;

public class Sort0s1s2s {

    public static boolean sortArray(int[] array, int n){
        int[] sortedArray={0,0,0,0,0,1,1,1,1,2,2,2};
        int zero=0;
        int one=0;
        int two=0;
        for (int i=0; i<n; i++){
            if (array[i] == 0){
                zero++;
            }else if (array[i] == 1) {
                one++;
            }else two++;
        }
        int index=0;

        for (int i=1; i<=zero; i++){
            array[index++]=0;
        }

        for (int i=1; i<=one; i++){
            array[index++]=1;
        }

        for (int i=1; i<=two; i++){
            array[index++]=2;
        }

        if (Arrays.equals(array, sortedArray)){
            return  true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {

        int[] array={0,2,1,2,1,1,0,0,2,0,1,0};
        int[] sortedArray={0,0,0,0,0,1,1,1,1,2,2,2};
        int n= array.length;

        System.out.println(sortArray(array,n));


    }
}
