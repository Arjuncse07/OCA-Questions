package InterviewQuestions;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringSplit {

    public static  void printString(String str[], String approch){
        System.out.println("Splitting string by using method :"+ approch);
        for (String string:str) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
     String str= "91-8954967745";
     String[] strArray= str.split("-");
     printString(strArray, "String split Method");
      List<String> listString = Pattern.compile("-").splitAsStream(str).collect(Collectors.toList());
        System.out.println("Split String using pattern class");
      for (String string1: listString){
          System.out.println(string1);
      }


    }
}
