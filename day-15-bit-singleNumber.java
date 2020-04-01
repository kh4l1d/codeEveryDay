class Solution 
{
    public int singleNumber(int[] nums) 
    {
        int uniqueElement = nums[0];
        for(int i=1;i<nums.length;i++)
            uniqueElement = uniqueElement ^ nums[i];
        return uniqueElement;
    }
}
