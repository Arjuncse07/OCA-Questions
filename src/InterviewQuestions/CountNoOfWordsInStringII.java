package InterviewQuestions;

public class CountNoOfWordsInStringII {


    public  static int count(String s){
        int count=0;
        String[] strArrays=null;
        strArrays=s.split(" ");

        for (int i=0; i<=strArrays.length-1; i++){
            if (strArrays[i] != " "){
             count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {

        String str="Arjun is a good boy";
        System.out.println(str.length());
        System.out.println(count(str));

    }
}
