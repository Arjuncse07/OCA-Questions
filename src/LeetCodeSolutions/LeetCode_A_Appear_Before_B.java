package LeetCodeSolutions;

// fob stands for First Occurence of B

public class LeetCode_A_Appear_Before_B {

    public boolean checkString(String s) {
      int fob= -1;
      int StringLength= s.length();

      // firstOccurence of b   left to right
        for(int i=0; i<StringLength; i++){
             if (s.charAt(i)=='b'){
                 fob=i;
                 break;
             }
        }

        if (fob == -1){
            return true;
        }

        // lastOccurence of A   right to left
        for (int i=StringLength-1; i>=0; i-- ){
            if (s.charAt(i)== 'a'){
                return i < fob;
            }
        }

       return true;
    }

    public static void main(String[] args) {
        LeetCode_A_Appear_Before_B a_appear_before_b_Object= new LeetCode_A_Appear_Before_B();
        System.out.println(a_appear_before_b_Object.checkString("aaabbb"));

    }

}
