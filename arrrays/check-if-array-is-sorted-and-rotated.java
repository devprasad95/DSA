class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] > nums[(i + 1) % n]){
              // why we use nums[i] > nums[(i + 1) % n, is
              // because if is rotated the 0th index should be greater than the last index
              // chect the logic with this example [2,1,3,4]
                count++;
            }
        }
        return count <= 1;
    }
}
