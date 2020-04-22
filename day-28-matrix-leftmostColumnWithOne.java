// Problem statement = https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3306/

/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

import java.util.ArrayList;

class Solution 
{
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) 
    {
        List<Integer> l = new ArrayList<Integer>();
        l = binaryMatrix.dimensions();
        
        int r = l.get(0);
        int c = l.get(1);
        
        int answer = c - 1;
        boolean allZeroes = true;
        
        for(int i=0;i<r;i++)
        {
            for(int j=c-1;j>=0;j--)
            {
                if(j <= answer)
                {
                    if(binaryMatrix.get(i,j) == 0)
                        break;
                    else
                    {
                        allZeroes = false;
                        
                        if(j < answer)
                            answer = j;
                    }
                }
            }
        }
        
        if(allZeroes == true)
            return -1;
        
        return answer;
    }
}
