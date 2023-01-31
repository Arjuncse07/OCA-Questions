package LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

    String names="Arjun, Ravi, Babblue, Sumit, Karan, Forturne, Dolly";

        List<String> word= Arrays.asList("Arjun", "Ravi", "Babblu", "Sumit", "Karan", "Fortune","Dolly");

        Collections.sort(word ,(s1,s2) -> s1.compareTo(s2));

        for (String words: word ){
            System.out.println(words);
        }


    }
}
