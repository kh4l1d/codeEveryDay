// Problem statment = https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3300/

import java.util.Arrays;

class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int i, temp = 1, n = nums.length;
        int product[] = new int[n];
        
        Arrays.fill(product,1);
        
        for(i=0;i<n;i++)
        {
            product[i] = temp;
            temp = temp * nums[i];
        }
        
        temp = 1;
        
        for(i=n-1;i>=0;i--)
        {
            product[i] = product[i] * temp;
            temp = temp * nums[i];
        }
        
        return product;
    }
}
