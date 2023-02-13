package LeetCodeSolutions;

import java.util.Scanner;

public class CountNumbers {

   static int countNumber(int n){
        int count=0;
        // while loop is used when we don't know iterations
       // for loop is used when we know number of iterations
        while(n>0){
            n= n/10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countNumber(n));
    }
}
