package InterviewQuestions;

public class CapitalFirstElementOfString {

    public static final String capatilize(String str)
    {

        if(str == null || str.length() == 0){
          return str;
        }
        return str.substring(0,1).toUpperCase()+ str.substring(1);
    }

    public static void main(String[] args) {
        System.out.println(capatilize("arjun"));
        System.out.println(capatilize("this is arjun"));
    }
}
