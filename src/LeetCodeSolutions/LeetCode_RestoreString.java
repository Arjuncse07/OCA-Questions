package LeetCodeSolutions;
// valueOf() convert the int float char into String.
public class LeetCode_RestoreString {

    public String restoreString(String s, int[] indices) {

       char arr[] = new char[s.length()];

       for (int i=0; i<s.length(); i++){

           arr[indices[i]]= s.charAt(i);

       }
       String result= String.valueOf(arr);
       return  result;
    }

    public static void main(String[] args) {
        LeetCode_RestoreString restoreStringObject= new LeetCode_RestoreString();
        int[] amint= new int[] {4,5,6,7,0,2,1,3};
        System.out.println(restoreStringObject.restoreString("codeleet", amint));
    }
}
