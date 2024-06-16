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
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1){
            return;
        }
        for(int i = j + 1; i < n; i++){
            if(nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
