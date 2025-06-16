package Round2.leetcode;

public class leetcode35 {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            } else if(target>nums[mid]){
                start = mid +1;
            } else{
                return mid;
            }
        } 
        if(target>nums[nums.length-1]){
            return nums.length;
    }
        return start;
    }
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 5;
        int ans = searchInsert(nums, target);
        System.out.println(ans);
    }
}
