package InterviewQuestions;

public class RemoveDuplicateEelementsArray {

    public static int removeDuplicates(int[] arr, int n) {  //create a method which having the array parameters and n type of the array
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
         arr[i]=temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,3,3,3,4,4,4,56,23,45,56,56};
        int length= arr.length;
        length=removeDuplicates(arr, length);
        for (int i=0; i<length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

