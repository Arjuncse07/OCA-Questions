package InterviewQuestions;

import java.util.Arrays;

public class AnagramString2 {

    public static boolean anagramStrings(String str1, String str2){
        char[] ch1= str1.toCharArray();
        char[] ch2= str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }

    public static void main(String[] args) {
        String str1="Arjun";
        String str2="unjrA";

        System.out.println("Both Strings are anagrams:"+anagramStrings(str1,str2));
    }
}
