import java.util.ArrayList;

class Solution
{
    ArrayList<Integer> beginningOfPattern = new ArrayList<Integer>();
    
    //public int beginningOfPattern = 0;
    
    public int sumOfSquares(int n)
    {
        int sum = 0, digit = 0;
        
        while(n > 0)
        {
            digit = n % 10;
            sum = sum + (digit * digit);
            n = n / 10;
        }
        
        return sum;
    }
    
    
    public boolean iteratingThroughPattern(int n)
    {
        int sum = sumOfSquares(n);
        
        if(sum == 1)
            return true;
        else if(beginningOfPattern.contains(sum))//else if(sum == beginningOfPattern.get(beginningOfPattern.size()-1))
            return false;
        else
        {
            beginningOfPattern.add(sum);
            return iteratingThroughPattern(sum);
            
        }
    }
    
    
    public boolean isHappy(int n) 
    {
        beginningOfPattern.add(sumOfSquares(n));
        
        if(beginningOfPattern.get(0) == 1)
            return true;
        
        boolean answer = iteratingThroughPattern(beginningOfPattern.get(0));
        return answer;
    }
}
