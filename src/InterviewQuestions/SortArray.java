package InterviewQuestions;

public class SortArray {

    public static void sortArray(int[] arr1, int[] arr2){
        for (int i=0; i<arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                int temp = 0;

                if (arr1[i] > arr1[j]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for (int i=0; i<arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                int temp1 = 0;

                if (arr2[i] > arr2[j]) {
                    temp1 = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp1;
                }
            }
        }
    }
    public static boolean checkArraysEqual(int[] arr1, int[] arr2){

        if (arr1.length !=  arr2.length){
            return false;
        }

        sortArray(arr1, arr2);

        for (int i=0; i<arr1.length; i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr1={1,4,3,5,2,9,8};
        int [] arr2= {8,9,2,10,3,4,1};

        System.out.println(checkArraysEqual(arr1,arr2));

    }
}
