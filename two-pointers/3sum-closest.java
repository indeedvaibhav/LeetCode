class Solution {
    public int threeSumClosest(int[] nums, int target) 
    {
         Arrays.sort(nums);
        int n=nums.length;
        int nearestsum=nums[0]+nums[1]+nums[2];

        for(int i=0;i<n-1;i++)
        {
            int left=i+1;
            int right=n-1;
            while(left<right)
            {
                int sumatp=nums[i]+nums[left]+nums[right];
                if(Math.abs(sumatp-target)<(Math.abs(nearestsum-target)))
                {
                    nearestsum=sumatp;
                }
                if(sumatp<target)
                    left++;
                else if(sumatp>target)
                    right--;
                else
                    return sumatp;
            }
        }
        return nearestsum;
    }
}