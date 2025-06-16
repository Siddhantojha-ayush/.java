package Round2.leetcode;

public class leetcode153 {
    public static void main(String args[]){
        int nums[] = {3,4,5,1,2};
        findMin(nums);
    }
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid  = start + (end-start)/2;
            if(nums[end]<nums[mid]){
                start = mid+1;
             } else{
                end = mid;
             }
        }
        return nums[start];
    }
    
}
