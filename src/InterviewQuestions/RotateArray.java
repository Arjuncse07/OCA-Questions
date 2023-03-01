package InterviewQuestions;

public class RotateArray {

    public static boolean rotateArray(int[] arr1, int index){
     int  s =index;
     int e= arr1.length-1;
     int temp;
     while (s<=e){
         temp=arr1[s];
         arr1[s]= arr1[e];
         arr1[e]= temp;
         s++;
         e--;
     }
     return true;
    }

    public static void main(String[] args) {
        int index=0;
        int[] arr1={1,2,3,4,5,6};
        System.out.println(rotateArray(arr1, index));

    }
}
