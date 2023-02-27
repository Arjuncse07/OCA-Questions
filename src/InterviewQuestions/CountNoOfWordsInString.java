package InterviewQuestions;

public class CountNoOfWordsInString {


    public  static int count(String s){
        int count=0;
        if (s.charAt(0) != ' ' ){
            count++;
        }
       for (int i=0; i<s.length(); i++){
           if (s.charAt(i) == ' ' && s.charAt(i+1) != ' ' ){
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
