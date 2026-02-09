class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a =lower_bound(nums, target);
        int b=upper_bound(nums,target);
        return new int[] {a,b};
    }
    private int lower_bound(int nums[], int k)
    {
        int mid=0, low=0,high=nums.length-1, ret=-1;    
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(nums[mid]==k)
            {
                ret=mid;
                high=mid-1;
            }
            else if(nums[mid]<k)
            low=mid+1;
            else
            high=mid-1;
        }
        return ret;
    }
    private int upper_bound(int nums[], int k)
    {
        int mid=0, low=0,high=nums.length-1, ret=-1;    
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(nums[mid]==k)
            {
                ret=mid;
                low=mid+1;
            }
            else if(nums[mid]<k)
            low=mid+1;
            else
            high=mid-1;
        }
        return ret;
    }
}