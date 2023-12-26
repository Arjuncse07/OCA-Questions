package Streams;

import java.util.ArrayList;
import java.util.List;

public class DistinctMethodExercise {
    public static void main(String[] args) {
        //List.of(12,9,13,4,6,2,4,12,15);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(9);
        numbers.add(13);
        numbers.add(4);numbers.add(6);numbers.add(2);numbers.add(4);numbers.add(12);numbers.add(15);

        //Example of distinct and sorted
        //numbers.stream().distinct().forEach(System.out::println);
       numbers.stream().distinct().sorted().forEach(System.out::println);
    }



}
