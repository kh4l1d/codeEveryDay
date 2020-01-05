// Problem statement = https://leetcode.com/problems/product-of-array-except-self

class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;
        int[] output = new int[n];
        int[] leftSideArray = new int[n];
        int[] rightSideArray = new int[n];
        
        leftSideArray[0] = 1;
        for(int i=1;i<n;i++)
            leftSideArray[i] = leftSideArray[i-1] * nums[i-1];
        
        rightSideArray[n-1] = 1;
        for(int i=n-2;i>=0;i--)
            rightSideArray[i] = rightSideArray[i+1] * nums[i+1];
            
        for(int i=0;i<n;i++)
            output[i] = leftSideArray[i] * rightSideArray[i];
        
        return(output);
    }
}
