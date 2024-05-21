class Solution {
    public int mySqrt(int x) {
       long start = 1;
       long end = x;
       while (start <= end){
        long mid = (start + end) / 2;
        if(mid * mid == (long)(x)){
            return (int)(mid);
        } else if (mid * mid <= (long)(x)){
            start = mid + 1;
        } else {
            end = mid - 1;
        }
       } 
       return (int)(end);
    }
}
