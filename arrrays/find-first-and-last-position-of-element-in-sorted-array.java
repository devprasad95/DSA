class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = binarySearch(nums,target,true);
        if(result[0] != -1){
            result[1] = binarySearch(nums,target,false);
        }
        return result;
    }
    private int binarySearch(int[] nums, int target, boolean isLeft){
        int ans = -1;
        int start = 0; 
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]){
                end = mid - 1;
            } else {
               ans = mid;
               if(isLeft){
                end = mid - 1;
               } else {
                start = mid + 1;
               }
            }
        }
        return  ans;
    }
}
