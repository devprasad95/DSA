class Solution {
    public void sortColors(int[] nums) {
        int start = 0; 
        int middle = 0;
        int end = nums.length - 1;
        while(middle <= end){
            switch(nums[middle]){
                case 0:
                    swap(nums,start, middle);
                    start++;
                    middle++;
                    break;
                case 1:
                    middle++;
                    break;
                case 2:
                    swap(nums, middle,end);
                    end--;  
                    break;  
            }
        }
    }
    private void swap(int[] arr, int position1, int position2){
        int temp = arr[position1];
        arr[position1] = arr[position2];
        arr[position2] = temp;
    }
}
