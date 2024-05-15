class Solution {
    public boolean isGoodArray(int[] nums) {
        if(nums.length == 0){
            return false;
        }
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            ans = gcd(ans, nums[i]);
        }
        return ans == 1;
    }
    private int gcd(int a, int b){
        while(a > 0 && b > 0){
            if(a > b){
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if(a == 0){
            return b;
        }
        return a;
    }
}
