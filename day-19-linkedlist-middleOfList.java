// Problem statement = https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3290/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution 
{
    public ListNode middleNode(ListNode head)
    {
        ListNode slowNode = head;
        ListNode fastNode = head;
        
        while((fastNode != null) && (fastNode.next != null))
        {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
                
        }
        
        return slowNode;
    }
    
    
    /* Classic approach -
    
    public ListNode middleNode(ListNode head) 
    {
        int answer = 0;
        int mid = (lengthOfList(head) / 2);
        
        while(mid > 0)
        {
            head = head.next;
            mid--;
        }
        
        return head;
    }
    
    public int lengthOfList(ListNode head)
    {
        int length = 0;
        
        while(head != null)
        {
            length++;
            head = head.next;
        }
        
        return length;
    } */
}
