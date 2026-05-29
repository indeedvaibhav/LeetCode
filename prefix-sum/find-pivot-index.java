class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int pivot=0;int count=0;
        for(int i=0;i<n;i++)
        {
            pivot=i;
            int leftSum=0;
            int rightSum=0;
            for(int j=1;j<=n;j++)
            {
                if((pivot+j)<n)rightSum+=nums[pivot+j];
                if((pivot-j>=0)) leftSum+=nums[pivot-j];
            }
            if(leftSum==rightSum)
{            count=1;break;
}        }
        if(count==1)
        return pivot;
        else return -1;
        
    }
}