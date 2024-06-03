class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = findMax(piles); // O(N)
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int total = totalHrs(piles, mid); // O(M)
            if (total <= h) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public int findMax(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for (int n : arr) {
            maxi = Math.max(maxi, n);
        }
        return maxi;
    }

    public int totalHrs(int[] piles, int hourly) {
        int total = 0;
        for (int p : piles) {
            total += Math.ceil((double) p / (double) hourly);
        }
        return total;
    }
}
// Time complexity = O(N) + O(M) * log(max)
// Space complexity = O(1)
