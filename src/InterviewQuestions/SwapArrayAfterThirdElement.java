package InterviewQuestions;

public class SwapArrayAfterThirdElement {

    public static boolean swapArrayAfterThirdElement(int[] arr, int index ){

        int s= index+1;
        int e= arr.length-1;
        int temp;
        while (s<=e){
            temp=arr[s];
            arr[s] = arr[e];
            arr[e]= temp;
           s++;
           e--;
        }

        return true  ;
    }


    public static void main(String[] args) {
        int index= 3;
       int[]  OriginalArray ={1,4,3,2,6,7,8,9};

        System.out.println(swapArrayAfterThirdElement(OriginalArray,index));
    }
}
