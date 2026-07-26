class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left= new int[nums.length];
        int[] right= new int[nums.length];
        int productleft=1;
        for(int i=0;i<left.length;i++)
        {
            left[i]=productleft;
            productleft*=nums[i];
        }
        int productRight=1;
        for(int i=right.length-1;i>=0;i--)
        {
            right[i]=productRight;
            productRight*=nums[i];
        }
        int[] ans= new int[nums.length];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]= left[i]*right[i];
        }
        return ans;
    }
}