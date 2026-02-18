class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        
        int n=nums.length;
        if(n == 1)
            return 1;
        int idx=2;
        for(int i=2;i<n;i++)
        {
 
                if(nums[idx-2] != nums[i])
                nums[idx++]=nums[i];
        }
        return idx;
    }
}