package StringJoiner;
// Calculate the total of all the numbers in a list using java 8

import java.util.Arrays;
import java.util.List;

public class InterviewCodingDemo {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(2,5,6,7,8,10,22,25);
        int sum=list.stream().mapToInt(l -> l).sum();

        System.out.println(sum);
    }
}
