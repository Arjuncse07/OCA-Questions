package InterviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
// Character : key and Value: Integer LinkedHM =Insertion Order is preserved
public class FirstNonRepeatedCharacter {
    public static char  getFirstNonRepeatedCharacters(String str){
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (char ch  : str.toCharArray()){
         countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch)+1 : 1);
        }
        for (Map.Entry<Character,Integer> entry : countMap.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
      throw  new RuntimeException("Did'n find repeated character");
    }
    public static void main(String[] args) {
        char ch= getFirstNonRepeatedCharacters("aabbdef");
        System.out.println("First Non-Repeated character are: "+ch);
    }
}
