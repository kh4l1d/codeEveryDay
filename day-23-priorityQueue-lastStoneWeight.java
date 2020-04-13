// Problem statement = https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3297/
class Solution
{
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        
        int n = stones.length;
        for(int i=0;i<n;i++)
            q.offer(stones[i]);
        
        while (q.size() > 1)
            q.offer(q.poll() - q.poll());
        
        return q.peek();
    }
}
