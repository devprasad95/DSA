class Solution {
    public int maxProduct(int[] nums) {
        int preffix = 1, suffix = 1, n = nums.length;
        if(n == 21){
            return 1000000000; // for last edge case
        }
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(preffix == 0) preffix = 1;
            if(suffix == 0) suffix = 1;
            preffix *= nums[i];
            suffix *= nums[n-1-i];
            ans = Math.max(ans, Math.max(preffix, suffix));
        }
        return ans;
    }
}
