package InterviewQuestions;
// Happy number are
/*
n=19;
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^0 + 0^0 = 1

This number is Happy Number;
 */

import javax.naming.ldap.HasControls;
import java.util.HashSet;

public class HappyNumber {

    public static boolean happyNumber(int number){

        HashSet<Integer> hashSet= new HashSet<>();
        while ( !hashSet.contains(number)){
           hashSet.add(number);
           int squareSum=0;
           while (number!= 0){
               int remainder = number %10;
               squareSum= squareSum+ remainder* remainder;
               number= number/10;
           }

           if (squareSum ==1){
               return true;
           }else {
               number=squareSum;
           }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(happyNumber(25));
    }
}
