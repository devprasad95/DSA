class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) (m * k);
        int n = bloomDay.length;
        if(m > (n / k)){
            return -1;
        }
        if(val > n){
            return -1;
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =  0; i < n; i++){
            max = Math.max(max, bloomDay[i]);
            min = Math.min(min, bloomDay[i]);
        }
        int start = min,  end = max;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(possible(bloomDay, mid, m , k)){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public boolean possible(int[] arr, int day, int m, int k){
        int count = 0;
        int noOfB = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= day){
                count++;
            } else {
                noOfB += count / k;
                count = 0;
            }
        }
        noOfB += count / k;
        return noOfB >= m;
    }
}
