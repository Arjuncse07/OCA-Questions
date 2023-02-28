package InterviewQuestions;
public class CompareTwoStringsII {

    public static int compare(String s1, String s2) {

        int i = 0;

        while (i < s1.length() && i < s2.length() && (s1.charAt(i) == s2.charAt(i))) {
            i++;

        }
        if (i==s1.length()&&i==s2.length()){
            System.out.println("Strings are equal");
            return 0;

        }
        if (i>=s1.length()){
            return -1;
        } else if (i>=s2.length()) {
            return 1;
        }
        return s1.charAt(i)-s2.charAt(i);
    }


    public static void main(String[] args) {
        String s1 = "Arjun";
        String s2 = "Arjuz";

        System.out.println(compare(s1, s2));
    }
}
