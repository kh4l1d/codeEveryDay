// Problem statement = https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3298/

import java.util.HashMap;
import java.util.Map;

class Solution
{
    public int findMaxLength(int[] nums) 
    {
        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,-1);
        int n = nums.length, count = 0, maxLen = 0;

        for(int i=0;i<n;i++)
        {
            if(nums[i] == 0)
                count--;
            else
                count++;

            if(map.containsKey(count))
                maxLen = Math.max(maxLen,i-map.get(count));
            else
                map.put(count,i);
        }
        
        return maxLen;
    }
}
