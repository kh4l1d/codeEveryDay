// Problem statement = https://leetcode.com/problems/maximum-subarray

class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int n = nums.length, sum = 0, maxSum = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            sum = sum + nums[i];
            
            if(sum > maxSum)
                maxSum = sum;
            
            if(sum < 0)
                sum = 0;
        }
        
        return(maxSum);
    }
}
