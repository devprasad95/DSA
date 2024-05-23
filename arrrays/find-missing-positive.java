class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        if(nums == null || n == 0){
            return 1;
        }
        
        boolean containsOne = false;
      //step 1
        for(int i = 0; i < n; i++){
            if(nums[i] == 1) {
                containsOne = true;
            } else if(nums[i] <= 0 || nums[i] > n){
                nums[i] = 1;
            }
        }
        if(!containsOne){
            return 1;
        }
      //step 2
        for(int i = 0; i < n; i++){
            int index = Math.abs(nums[i]) - 1;
            // Why do we Math.abs here?
            //Because in the below code we are making nums[i] as negative value
            if(nums[index] > 0){
                nums[index] = -1 * nums[index];
                
            }
        }
      //step 3
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                return i + 1;
            }
        }
        return n + 1; // [1,2,3]
    }
}
