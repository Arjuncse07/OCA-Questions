package InterviewQuestions;

public class CountCharactersString {

    public static void count(String str){
        char[] ch= str.toCharArray();
        for (int i=0; i<ch.length; i++){

            String output="";
            while (i< ch.length && ch[i] != ' '){
                output = output+ ch[i];
                i++;
            }
            if (output.length()>0){
                System.out.println(output + ":"+ output.length());
            }
        }
    }

    public static void main(String[] args) {

        //Method :1
//        String str="Arjun Boy";
//        int count=0;
//        for (int i=0; i<str.length(); i++){
//            if (str.charAt(i) != ' '){
//                count++;a
//            }
//        }
//        System.out.println(count);
//    }

        //Method:2

        String ss="Arjun Boy";
         count(ss);

    }
}
