class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftsum=new int[nums.length];
        int[] rightsum=new int[nums.length];
        int[] ans=new int[nums.length];

        int leftans=0,rightans=0;
        leftsum[0]=0;
        for(int i=1;i<nums.length;i++) {
            leftans += nums[i-1];
            leftsum[i] = leftans;
        }

        for(int i=nums.length-1;i>=0;i--) {
            rightsum[i] = rightans;
            rightans += nums[i];
        }



        for(int i=0;i< nums.length;i++)
        {
            ans[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return ans;
    }
}
