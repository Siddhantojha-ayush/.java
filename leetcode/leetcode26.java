package Round2.leetcode;

import java.util.Arrays;

public class leetcode26 {
    public static void main(String args[]){
        int[] nums = {1,1,2};
        int length = removeDuplicates(nums);
        System.out.println("Number of unique elements: " + length);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, length)));
    }
    public static int removeDuplicates(int[] nums) {
        int unique = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=nums[unique-1]){
                nums[unique]=nums[i];
                unique++;
            }
        }
        return unique;
    }
}
