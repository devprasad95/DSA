class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int first = bs(arr, n, x, true);
        if(first == -1){
            return 0;
        }
        int last = bs(arr, n, x, false);
        int ans = (last - first) + 1;
        return ans;
    }
    int bs(int[] arr, int n, int x, boolean first){
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(x < arr[mid]){
                end = mid - 1;
            } else if(x > arr[mid]){
                start = mid + 1;
            } else {
                ans = mid;
                if(first){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
