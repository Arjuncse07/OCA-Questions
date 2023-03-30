package InterviewQuestions;

import java.util.Arrays;

public class SortArrays {


    public static boolean sortArray(int[] arr11, int[] arr22){

        if (arr11.length == '0' && arr22.length  =='0' ){
            return false;
        }

        if (arr11.length != arr22.length){
            return false;
        }

        //Sort two arrays are
        int temp=0;
        for (int i=0; i<arr11.length; i++){
            for (int j=i+1; j<arr11.length; j++){
                if (arr11[i] > arr11[i+1]){
                   temp=arr11[i];
                   arr11[i]= arr11[j];
                   arr11[j]= temp;
                }
            }
        }

        for (int i=0; i<arr22.length; i++){
            for (int j=i+1; j<arr22.length; j++){
                if (arr22[i] > arr22[i+1]){
                    temp=arr22[i];
                    arr22[i]=arr22[j];
                    arr22[i]= temp;
                }
            }

        }


        return true;
    }
    public static void main(String[] args) {

        int[] arr11= {1,34,23,2,5,4,5,3};
        int[] arr22= {2,3,34,2,1,2,3,4};

        System.out.println(sortArray(arr11,arr22));
    }
}
