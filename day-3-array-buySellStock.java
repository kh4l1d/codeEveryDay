// Problem statement = https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution 
{
    public int maxProfit(int[] prices) 
    {
        // Consider the array [7,1,5,3,6,4,5,9,0,5]
        
        int n = prices.length;
        int maxProfit = 0;
        int minPrice = 999999;
        
        for(int i=0;i<n-1;i++)
        {
            if(prices[i] < minPrice)
                minPrice = prices[i];
            
            if((prices[i+1] - minPrice) > maxProfit)
                maxProfit = prices[i+1] - minPrice;
        }
        
        return(maxProfit);
        /* 
        //Classical approach
        int n = prices.length;
        int maxProfit = 0;
        int profit = 0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                profit = prices[j] - prices[i];
                if(profit > maxProfit)
                    maxProfit = profit;
            }
        }
        return(maxProfit);
        */
    }
}
