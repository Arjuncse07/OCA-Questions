package LeetCodeSolutions;


import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s){
        Map<Character, Integer> map= new HashMap<>();
        map.put('V',5);
        map.put('X',10);
        map.put('I',1);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        System.out.println(s.length());
        int ans=0;
        for (int i=0; i<s.length(); i++){

            // IV  == (5-1) = 4
            int first= map.get(s.charAt(i)); // i th element
            int second;   // i+1th element

            if (i+1 < s.length()){    // means IV ==
                second= map.get(s.charAt(i+1));

                if (first<second){  // VI  IV  V is smaller than I  , I<V
                    ans += (second-first);
                    i++;
                }else {
                    ans += first;
                }
            }else {
                ans += first;

            }
        }

    return ans;
    }
    public static void main(String[] args) {
        Solution solution= new Solution();
        System.out.println(solution.romanToInt("VI"));
    }
}
