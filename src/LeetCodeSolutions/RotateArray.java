package LeetCodeSolutions;
//Rotate Array in java

public class RotateArray {

    public void rotate(int[] nums, int k){
     for (int i=0; i<=k; i++){
         leftSwipeOfElement(nums);
     }
    }

    public void leftSwipeOfElement(int[] nums) {
       int temp= nums[0];
     for (int i=0; i< nums.length-1; i++){
         nums[i]=nums[i+1];
     }
     nums[nums.length-1]=temp;
    }


    public static void main(String[] args) {
     RotateArray rotateArray= new RotateArray();
     int[] nums = {1,2,3,4,5,6,7};
     rotateArray.rotate(nums,3);
    }
}
