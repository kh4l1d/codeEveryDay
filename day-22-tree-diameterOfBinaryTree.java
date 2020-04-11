// Problem statement = https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3293/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution 
{
    
    public int getHeightOfBinaryTree(TreeNode t)
    {
        if(t == null)
            return 0;
        else
        {
            int leftHeight = getHeightOfBinaryTree(t.left);
            int rightHeight = getHeightOfBinaryTree(t.right);
            
            if(leftHeight > rightHeight)
                return (leftHeight + 1);
            else
                return (rightHeight + 1);
        }
    }
    
    public int diameterOfBinaryTree(TreeNode root) 
    {
        if(root == null)
            return 0;
        
        int heightOfLeftSubtree = getHeightOfBinaryTree(root.left);
        int heightOfRightSubtree = getHeightOfBinaryTree(root.right);
        
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        
        return (Math.max((heightOfLeftSubtree + heightOfRightSubtree),Math.max(leftDiameter,rightDiameter)));
    }
}
