// Problem statement = https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3301/

class Solution 
{
    public boolean checkValidString(String s) 
    {
        int lo = 0, hi = 0;
       for (char c: s.toCharArray()) 
       {
           lo += c == '(' ? 1 : -1;
           hi += c != ')' ? 1 : -1;
           if (hi < 0) break;
           lo = Math.max(lo, 0);
       }
       return lo == 0;
    }
}
