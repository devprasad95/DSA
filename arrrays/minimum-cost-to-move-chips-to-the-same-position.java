class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd = 0, even = 0;
        for(int n : position){
            if(n % 2 == 0) even++;
            else odd++;
        }
        return Math.min(even, odd);
    }
}
