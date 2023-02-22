package InterviewQuestions;

public class DuplicateCharacterString {
    public static void main(String[] args) {

        String str= "swatisatis";
        int count;
        char[] ch= str.toCharArray();

        System.out.println("Duplicate Elements in string are:");

        for(int i=0; i<ch.length; i++){
           count=1;

            for (int j= i+1; j<ch.length; j++){
             if (ch[i] == ch[j] && ch[i] != ' '){
              count++;
              //set ch[j] to 0 to avoid priting visited character
                 ch[j]='0';
             }
            }
            if (count > 1 && ch[i] != '0'){
                System.out.println( ch[i]);
            }
        }
    }



}
