class Solution {
    public int maximumCount(int[] nums) {
        {
        Scanner sc=new Scanner(System.in);
        int n=nums.length;
        int negative=0,positive=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
              continue;
            else if(nums[i]>0)
                positive++;
                else
                negative++;
        }
        if(negative>positive)
            return negative;
        else if(positive==negative)
           return positive;
        else
            return positive;
    }
    }
}