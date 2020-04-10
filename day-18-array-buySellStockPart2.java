// Problem statement = https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int maxProfit = 0, n = prices.length;
        for(int i=0,j=1;j<n;i++,j++)
            if(prices[j] > prices[i])
                maxProfit += (prices[j] - prices[i]);
        
        return maxProfit;
    }
}
