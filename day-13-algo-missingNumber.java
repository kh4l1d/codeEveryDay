// Problem statement = https://leetcode.com/problems/missing-number

class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int n = nums.length, answer = 0, sum = 0;
        
        // recall formula -> 1 + 2 + ... + n = n(n + 1) / 2
        
        int sumExpected = ((n * (n + 1)) / 2 );
        
        for(int i=0;i<n;i++)
            sum = sum + nums[i];
        
        answer = (sumExpected - sum);
        
        return answer;
    }
}
