// Problem statement = https://leetcode.com/problems/two-sum

class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] answer = new int[2];
        int n = nums.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++)
            map.put(nums[i],i);
            
        for(int i=0,jValue=0;i<n;i++)
        {
            jValue = target - nums[i];
            // the 2nd condition is important - consider the array [30,20,40] and target = 60
            if(map.containsKey(jValue) && (map.get(jValue) != i))
            {
                answer[0] = i;
                answer[1] = map.get(jValue);
                i=n;
                break;
            }
        }
        
        return(answer);

        
        /*
        //Classical approach
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((nums[i]+nums[j]) == target)
                {
                    answer[0] = i;
                    answer[1] = j;
                    i=n;
                    j=n;
                    break;
                }
            }
        }
        
    return(answer);
        */
        
       
    }
}
