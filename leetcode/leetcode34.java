package Round2.leetcode;

public class leetcode34 {
    public static void main(String args[]){
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        int ans[] = searchRange(nums, target);
        System.out.println(ans[0] + ans[1]);
    }
    public static int[] searchRange(int[] nums, int target) {
        int result[] = new int[2];
        result[0] = first(nums, target);
        result[1] = last(nums, target);
        return result;
    }
    public static int first(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int first = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                first = mid;
                end = mid -1;
            } else if(target<nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return first;
    }
    public static int last(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int last = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                last = mid;
                start = mid + 1;
            } else if(target<nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return last;
    }
}
