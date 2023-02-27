package InterviewQuestions;

public class AnagramString {

    public static boolean anangram(String str1, String str2){
        char[] ch1=  str1.toCharArray();

        StringBuilder stringBuilder= new StringBuilder(str2);

        for (char c : ch1){
            int index= stringBuilder.indexOf(String.valueOf(c));
            if (index != -1){
                stringBuilder.deleteCharAt(index);
            }else {
                return false;
            }
        }
    return true;

    }

    public static void main(String[] args) {
        String str1="Tastez";
        String str2= "etsaT";

        System.out.println(anangram(str1,str2));

    }
}
