package Streams;

import java.util.ArrayList;
import java.util.List;

/*
Calculate the sum using reduce.
 */
public class ReduceMethodExercise {

    public static void main(String[] args) {
        //List.of(12,9,13,4,6,2,4,12,15);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(9);
        numbers.add(13);
        numbers.add(4);
        numbers.add(6);
        numbers.add(2);
        numbers.add(4);
        numbers.add(12);
        numbers.add(15);

        int sum  = addListStuctured(numbers);
        System.out.println(sum);

    }

    //Finding sum
    private static int sum(int a , int b){
        System.out.println(a + " " +b);
        return a +b;
    }

    //Finding square
    private static int square(int number1, int number){
        System.out.println(number1 + " " +number);
        int square = number * number;
        return square;
    }

    //Finding cube
    private static int cube(int number){
        int cube = number * number *number;
        return cube;
    }


    private static int addListStuctured(List<Integer> numbers) {
        //Approch : 01
        //int sum = numbers.stream().reduce(0,(x,y) -> x+y);

        //Approch : 02
       // numbers.stream().reduce(0,ReduceMethodExercise::sum);

       // Print sum of squares in a list
       // numbers.stream().map(number -> number*number).reduce(0,Integer::sum);

        //Print sum of cube in a list
        numbers.stream().map(number -> number*number*number).reduce(0,Integer::sum);

        //Print the sum of odd values in a list
        numbers.stream().filter( number -> number%2==1).reduce(0,Integer::sum);

        //Print the sum of even value in a list
        numbers.stream().filter( number -> number%2==0).reduce(0,Integer::sum);
        return numbers.stream().filter( number -> number%2==0).reduce(0,Integer::sum);
    }




}
