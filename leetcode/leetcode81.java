package Round2.leetcode;

public class leetcode81 {
    public static void main(String args[]){
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        boolean ans = search(nums, target);
        System.out.println(ans);
    }
    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return true;
            }

            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start = start+1;
                end = end-1;
                continue;
            }

            else if(nums[start]<=nums[mid]){
                if(nums[start]<=target && nums[mid]>target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            } else{
                if(nums[mid]<target && target<=nums[end]){
                    start = start+1;
                }else{
                    end = end-1;
                }
            }
        }
        return false;
    }
}
