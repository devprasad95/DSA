class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[start] <= nums[end]){
                min = Math.min(min, nums[start]);
                break;
              //Why do we use break here?
              //Because it is an sorted array and also we are taking full length of array, in other cases we are considering only half.
            }
            if(nums[start] <= nums[mid]){
                min = Math.min(min, nums[start]);
                start = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                end = mid - 1;
            }
        }
        return min;
    }
}
