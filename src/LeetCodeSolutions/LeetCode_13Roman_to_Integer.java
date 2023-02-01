package LeetCodeSolutions;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_13Roman_to_Integer {

public int romanToInt(String s){
    Map<Character, Integer> map= new HashMap<>();
    map.put('V',5);
    map.put('X',10);
    map.put('I',1);
    map.put('L',50);
    map.put('C',100);
    map.put('D',500);
    map.put('M',1000);

    int ans=0;

    for (int i=0; i<s.length(); i++){
        int first= map.get(s.charAt(i));
        int second;

        // IV  == 4 (5-1)    VI == 6(5+1)
     if (i+1< s.length()){
         second= map.get(s.charAt(i+1));

         if (first<second){
             ans +=(second-first);
             i++;
         }else {
           ans +=first;
         }
     }else {
         ans += first;
     }

    }
    return ans;
}

    public static void main(String[] args) {
    LeetCode_13Roman_to_Integer romanToInteger = new LeetCode_13Roman_to_Integer();
        System.out.println(romanToInteger.romanToInt("XI"));

    }
}
