class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        double left = 1;
        double right = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(left == 0) left = 1;
            if(right == 0) right = 1;
            left *= (double) nums[i];
            right *= (double) nums[n - 1 - i];
            max = (int) Math.max((double) max, Math.max(left, right));
        }
        return max;
    }
}
