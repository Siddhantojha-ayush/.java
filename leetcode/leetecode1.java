package Round2.leetcode;

import java.util.Arrays;

public class leetecode1 {
     public static void main(String[] args){
                int[] num = {2,7,11,15};

        int target = 9;

         int[] result = twoSum(num, target);

        if (result != null) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No solution found.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length==0) {
            return null;
        }
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
        }
        }
               
            
        
        return null;
    }
}
