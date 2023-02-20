package InterviewQuestions;

public class CapitalEveryFirstElementOfString {

    public static String capitalizeWord(String str){
       String words[] = str.split("\\s");
       String capitalizeWord= "";

       for (String w : words){
           String first = w.substring(0,1);
           String afterFirst = w.substring(1);
           capitalizeWord = capitalizeWord + first.toUpperCase()+ afterFirst+ " ";
       }

        return  capitalizeWord;
    }

    public static void main(String[] args) {
        System.out.println(capitalizeWord("This is arjun"));
    }
}
