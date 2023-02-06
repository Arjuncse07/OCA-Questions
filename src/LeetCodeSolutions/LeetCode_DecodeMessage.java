package LeetCodeSolutions;

import java.util.ArrayList;

public class LeetCode_DecodeMessage {


    public String decodeMessage(String key, String message) {
        int len = key.length();
        String res = "";
        ArrayList<Character> keyWithoutDuplicates = new ArrayList<>();

        for(int i = 0; i < len; i++) {
            char c = key.charAt(i);
            if(keyWithoutDuplicates.indexOf(c) == -1 && c != ' ')
                keyWithoutDuplicates.add(c);
        }
        len = message.length();
        for(int i = 0; i < len; i++) {
            char c = message.charAt(i);
            if(c == ' ') {
                res = res+ " ";
                continue;
            }
            int index = keyWithoutDuplicates.indexOf(c);
            res = res+ (char) ('a' + index);
        }

        return res;
    }
    public static void main(String[] args) {
     LeetCode_DecodeMessage decodeMessageObject= new LeetCode_DecodeMessage();
    String ss=decodeMessageObject.decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv");
        System.out.println(ss);
    }
}
