package LeetCodeSolutions;

public class LeetCode_Maximum_Num_Of_Words_In_Sentence {
    public int mostWordsFound(String[] sentences) {
        //logic count the space in each sentence
        //return the Max count +1 ;
        int result=0;
        int currentCount=0;

        for(String s: sentences){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)==' '){
                    currentCount+=1;
                }
            }
            result= Math.max(currentCount, result);
            currentCount=0;
        }
        return result+1;
    }

    public static void main(String[] args) {
     LeetCode_Maximum_Num_Of_Words_In_Sentence num = new LeetCode_Maximum_Num_Of_Words_In_Sentence();
      String [] sentences= new String[] {"alice and bob love leetcode","i think so too","this is great thanks very much"};
        System.out.println(num.mostWordsFound(sentences));
    }
}
