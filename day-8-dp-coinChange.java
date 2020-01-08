// Problem statement = https://leetcode.com/problems/coin-change

class Solution 
{
    public int coinChange(int[] coins, int amount) 
    {
        if (amount < 1)
            return 0;
        
        int answer = recursiveSolution(coins, amount, new int[amount+1]);
        
        if(answer == Integer.MAX_VALUE)
            return -1;
        else
            return answer;
    }
    
    public int recursiveSolution(int[] coins, int rem, int[] dp)
    {
        if(rem < 0)
            return -1;
        
        if(rem == 0)
            return 0;
        
        if(dp[rem] != 0)
            return dp[rem];
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<coins.length; i++)
        {
            int result = recursiveSolution(coins, rem-coins[i], dp);
            
            if((result >= 0) && (result < min))
                min = 1 + result;
        }
        
        if(min == Integer.MAX_VALUE)
            dp[rem] = -1;
        else
            dp[rem] = min;
        
        return dp[rem];
        
    }
}
