class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] copy=nums.clone();int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(copy[i]==k)
                count++;
            if((i+1)<nums.length)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    copy[j]+=copy[j-1];
                    if(copy[j]==k) count++;
                }
            }
            copy=nums.clone();
        }
        return count;
    }
}