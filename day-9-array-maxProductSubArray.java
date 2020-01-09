// Problem statement = https://leetcode.com/problems/maximum-product-subarray

class Solution 
{
    public int maxProduct(int[] nums) 
    {
        int n = nums.length;
        
        if(n == 0)
            return 0;
        
        int answer = nums[0];
        
        if(n == 1)
            return answer;
        
        int[] maxProducts = new int[n];
        int[] minProducts = new int[n];
        
        maxProducts[0] = answer;
        minProducts[0] = answer;
        
        for(int i=1;i<n;i++)
        {
            maxProducts[i] = Math.max(nums[i], maxProducts[i-1] * nums[i]);
            maxProducts[i] = Math.max(maxProducts[i], minProducts[i-1] * nums[i]);
            
            minProducts[i] = Math.min(nums[i], minProducts[i-1] * nums[i]);
            minProducts[i] = Math.min(minProducts[i], maxProducts[i-1] * nums[i]);
            
            answer = Math.max(answer, maxProducts[i]);
        }
        
        return answer;
    }
}
