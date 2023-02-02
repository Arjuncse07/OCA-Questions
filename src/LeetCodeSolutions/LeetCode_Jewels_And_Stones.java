package LeetCodeSolutions;
import java.util.HashMap;
/*
jewels = "aA", stones = "aAAbbbb"
 */
public class LeetCode_Jewels_And_Stones {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;

        HashMap<Character,Integer> map= new HashMap<>();

        for (int i=0; i< stones.length(); i++){
            char key = stones.charAt(i);
            if (map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }else {
                map.put(key,1);
            }}
        for (int j=0; j<jewels.length(); j++){
            char key= jewels.charAt(j);
            if (map.containsKey(key)){
                ans= ans+ map.get(key);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        LeetCode_Jewels_And_Stones leetCode_jewels_and_stones= new LeetCode_Jewels_And_Stones();
        System.out.println(leetCode_jewels_and_stones.numJewelsInStones("aA", "aAAbbbb"));

    }
}
