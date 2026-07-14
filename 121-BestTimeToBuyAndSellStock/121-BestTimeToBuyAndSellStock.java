// Last updated: 14/07/2026, 14:49:14
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int mincost=prices[0];
        for(int i=1;i<prices.length;i++){
            profit=Math.max(profit,prices[i]-mincost);
            if(mincost>prices[i]){
                mincost=prices[i];
            }
        }
        return profit;
    }
}