package InterviewQuestions;

public class EvenString {

    public static void main(String[] args) {
    String str= "Message me Bol Jald";
    for (String s : str.split(" ")){
        if (s.length() %2 == 0 ){
            System.out.println(s);
        }
    }
    }
}
