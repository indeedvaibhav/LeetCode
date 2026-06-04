class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,u=nums.length-1,found=0,m=0;
        while(l<=u)
        {
            m=u-(l+u)/2;
            if(target>nums[m])
            {u=m-1;}
            else if(target<nums[m])
            l=m+1;
            else 
            {
                found=1;
                break;
            }
            
        }
        if(found==1)
        return m;
        else
        
        
        
    }
}