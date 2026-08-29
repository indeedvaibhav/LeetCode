class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;int count=0;
        for(int num: nums)
            sum+=num;
        if(sum%k==0) return 0;
        else
        {
            while(sum%k!=0)
            {
                sum--;count++;
            }
        }
        return count;

        
    }
}