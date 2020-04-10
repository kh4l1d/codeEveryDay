// Problem statement = https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3291/

class Solution
{   
    
    public static String processedString(String s)
    {
        LinkedList<Character> l = new LinkedList<Character>();
        int n = s.length();
        String clearOfBackspaces = "";

        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) != '#')
                l.push(s.charAt(i));
            else if(l.size() != 0)
                l.pop();
        }
        
        while(l.size() > 0)
        {
            clearOfBackspaces = l.pop() + clearOfBackspaces;
        }
        
        return clearOfBackspaces;
        
    }
    
    public boolean backspaceCompare(String S, String T)
    {
        if(processedString(S).equals(processedString(T)))
            return true;
        else
            return false;
    }
    
}
