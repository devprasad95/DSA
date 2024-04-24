class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for(int price: prices){
            int currentProfit = price - min;
            maxProfit = Math.max(maxProfit, currentProfit);
            min = Math.min(min, price);
        }
        return maxProfit;
    }
}
