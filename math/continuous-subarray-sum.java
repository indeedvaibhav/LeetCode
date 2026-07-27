class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        boolean check=false;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0,len=0;
            for(int j=0;j<i+1;j++)
            {
                sum+=nums[j];
                len++;
            }
            if(sum%k==0 && len>=2) {
                check = true;break;
            }
        }
        return check;
        
    }
}