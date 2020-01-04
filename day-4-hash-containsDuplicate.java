// Problem statement = https://leetcode.com/problems/contains-duplicate

class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        int n = nums.length;
        boolean answer=false;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            // Check this - https://stackoverflow.com/questions/13687346/java-hashmap-get-method-null-pointer-exception
            // basically, map.get(nums[i]) doesn't return a boolean for the 'if' statement to evaluate if the element is not contained
            if((map.get(nums[i]) != null) && (map.get(nums[i]) == 1))
            {
                i = n;
                answer = true;
                break;
            }
            map.put(nums[i],1);
        }
            
        return(answer);
    }
}
