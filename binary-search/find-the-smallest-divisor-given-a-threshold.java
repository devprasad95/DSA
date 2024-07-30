class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if(n > threshold){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            max = Math.max(max, nums[i]);
        }
        int start = 1, end = max;
        while(start <= end){
            int mid = start + (end - start) / 2;
            int s = sumByD(nums, mid);
            if(s <= threshold){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public int sumByD(int[] arr, int d){
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += Math.ceil((double) arr[i] / (double) d);
        }
        return sum;
    }
}
