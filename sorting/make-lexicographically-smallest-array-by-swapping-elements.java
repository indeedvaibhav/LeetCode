class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        
        for(int i = 0 ;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                if(nums[i]-nums[j]<=limit){
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]= temp;
                }
            } 
        }
        return nums;
    }
}