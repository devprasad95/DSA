class Solution {
    public int splitArray(int[] nums, int k) {
        int start = nums[0];
        int end = 0;
        for(int num : nums){
            start = Math.max(start, num);
            end += num;
        }
        while(start <= end){
            int mid = start + (end - start) / 2;
            int p = findPartition(nums,mid);
            if(p > k){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
    public int findPartition(int[] nums, int maxSum){
        int partitions = 1;
        int subarraySum = 0;
        for(int num: nums){
            if(subarraySum + num > maxSum){
                subarraySum = num;
                partitions++;
            } else {
                subarraySum += num;   
            }
        }
        return partitions;
    }
}
