// Problem statement = https://leetcode.com/problems/valid-parentheses

class Solution 
{
    public boolean isValid(String s) 
    {
        Stack st = new Stack();
        int n = s.length();
        
        for(int i=0;i<n;i++)
        {
            switch(s.charAt(i))
            {
                case '(':   st.push(new Character('('));
                            break;
                case ')':   if(st.empty() || (char)st.pop() != '(')
                                return false;
                            break;
                case '[':   st.push(new Character('['));
                            break;
                case ']':   if(st.empty() || (char)st.pop() != '[')
                                return false;
                            break;
                case '{':   st.push(new Character('{'));
                            break;
                case '}':   if(st.empty() || (char)st.pop() != '{')
                                return false;
                            break;
            }
        }
        
        return st.empty();
    }
}
