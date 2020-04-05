class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int j=0;
        
        for(int i=0;i<nums.length;i++)
            if(nums[i] != 0)
                nums[j++] = nums[i];
        
        while(j < nums.length)
            nums[j++] = 0;
        
        System.out.print("[");
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i] + ",");
        System.out.print("]");
    }
}
