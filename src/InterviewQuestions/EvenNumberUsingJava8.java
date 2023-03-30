package InterviewQuestions;
import java.util.Arrays;
import java.util.List;

public class EvenNumberUsingJava8 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,3,4,3,5,6,7,8);
        list.stream().filter(e -> e%2 == 0).forEach(System.out::println);

    }
}
