//brute force approach
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                list.add(nums[i]);
            }
        }
        int size = list.size();
        for(int i = 0; i < size; i++){
            nums[i] = list.get(i);
        }
        for(int i = size; i < n; i++){
            nums[i] = 0;
        }
    }
}

//optimal solution
