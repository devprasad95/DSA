class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int goal = n- 1;
        for(int i = n - 2; i >= 0; i--){
            if(i + nums[i] >= goal){
                goal = i;
            }
        }
        return goal == 0;
    }
}


// striver ans
class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > max) return false;
            max = Math.max(max, i + nums[i]);
        }
        return true;
    }
}
