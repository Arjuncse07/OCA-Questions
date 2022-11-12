package InterviewQuestions;

import java.util.Scanner;

public class Regex {
    public static int countNumber(int a1){
        System.out.println(a1);
        return a1;
    }
    public static void main(String[] args) {
        boolean valid = false;
        String regexForNumbers = "^[0-9]*$";
        int a = regexForNumbers.length();
        Scanner scanner = new Scanner(System.in);
        while (!valid) {
            System.out.print("Input Value:");
            String s = scanner.nextLine();

//            if(a>8 && !s.matches(regexForNumbers)){
//                valid= false;
//               System.out.println("Not only Numbers, try again\n");
//            }else{
//                valid = true;
//                System.out.println("Only Numbers:"+ s);
//            }
//            }

            if (!s.matches(regexForNumbers)) {
                valid = false;
                System.out.println("Not only Numbers, try again\n");
            } else {
                valid = true;
                System.out.println("Only Numbers:" + s);
            }
        }
//        Regex regex= new Regex();
//           countNumber(24);
    }
}
