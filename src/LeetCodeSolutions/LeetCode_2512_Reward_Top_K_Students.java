package LeetCodeSolutions;

import java.util.*;

public class LeetCode_2512_Reward_Top_K_Students {

    //String[] positive_feedback={"smart","brilliant","studious"};
    //String[] negative_feedback= {"not"};
    //String[] report= {"this student is not studious","the student is smart", "this student is studious and brilliant"};
    //int[] student_id= {1,2,3,4,5,6};
    //int k= 1;
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {

        //Converting Arrays to set
        Set<String> positive_set = new HashSet<>(Arrays.asList(positive_feedback));

        Set<String> negative_set = new HashSet<>(Arrays.asList(negative_feedback));

        //Report contains key and value pair of two dimensional array
        int[][] id_score_arr = new int[report.length][2];

        for (int i = 0; i < report.length; i++) {
            String[] arr = report[i].split(" ");
            int score = 0;

            for (String x : arr) {
                if (positive_set.contains(x)) {
                    score += 3;
                }
                if (negative_set.contains(x)) {
                    score--;
                }
            }

            id_score_arr[i][0] = student_id[i];

            id_score_arr[i][1] = score;

        }

        //In case more than one student has the same points, the one with the lower ID ranks higher precedence.
        Arrays.sort(id_score_arr, (a,b) -> a[1]==b[1] ?  Integer.compare(a[0],b[0]) : Integer.compare(b[1],a[1]));

        List<Integer> list= new ArrayList<>();
        for (int i=0; i<k; i++){
            list.add(id_score_arr[i][0]);
        }

        return list;
    }


    public static void main(String[] args) {

        LeetCode_2512_Reward_Top_K_Students top_k_students = new LeetCode_2512_Reward_Top_K_Students();

        System.out.println( top_k_students.topStudents(new String[]{"smart", "brilliant", "studious"}
                , new String[]{"not"}, new String[]{"this student is not studious", "the student is smart", "this student is studious and brilliant"},
                new int[]{1, 2, 3},1));
    }
}
