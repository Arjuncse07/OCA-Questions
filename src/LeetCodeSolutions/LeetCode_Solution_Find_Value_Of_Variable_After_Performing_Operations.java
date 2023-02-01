package LeetCodeSolutions;

public class LeetCode_Solution_Find_Value_Of_Variable_After_Performing_Operations {

    public int finalValueAfterOperations(String[] operations) {
     int x=0;
     for (int i=0; i<operations.length; i++){
         if (operations[i].charAt(1)=='+'){
             x++;
         }else {
             x--;
         }
     }

        return x;
    }



    public static void main(String[] args) {
        LeetCode_Solution_Find_Value_Of_Variable_After_Performing_Operations value= new LeetCode_Solution_Find_Value_Of_Variable_After_Performing_Operations();


    }
}
