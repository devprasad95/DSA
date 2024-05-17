class Solution {
    public int search(int[] nums, int target) {
        int pivot = pivot(nums);
        int n = nums.length;
        if(pivot == -1){
            return binarySearch(nums,target, 0, n - 1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(nums[0] <= target){
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, n - 1);
    }
    public int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }
    public int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(start < mid && arr[mid - 1] > arr[mid]){
                return mid - 1;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            } 
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
