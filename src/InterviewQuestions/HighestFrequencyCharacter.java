package InterviewQuestions;

import java.util.HashMap;
import java.util.Set;

public class HighestFrequencyCharacter {
    public static int maxFrequencyNumber(int[] arr){
        if(arr.length == 0)
            return -1;
        int maxFreq = 0;
        int number = -1;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        // using set data structure
        Set<Integer> keySet = map.keySet();
        for(Integer i:keySet)
        {
            if(map.get(i) > maxFreq)
            {
                number = i;
                maxFreq = map.get(i);
            }
        }
        return number;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 1, 2, 1, 2, 2,2, 1};
        System.out.println(maxFrequencyNumber(arr));
    }
}
