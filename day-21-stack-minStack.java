// Problem statment = https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3292/

import java.util.Stack;

class MinStack 
{
    Stack<Integer> s = new Stack<Integer>();
    Stack<Integer> min = new Stack<>();

    /** initialize your data structure here. */
    
    public void push(int x) 
    {   
        s.push(x);
        
        if((min.isEmpty()) || (x < min.peek()))
            min.push(x);
        else
            min.push(min.peek());
            
    }
    
    public void pop() 
    {
        s.pop();
        min.pop();
    }
    
    public int top() 
    {
        return s.peek();
    }
    
    public int getMin() 
    {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
