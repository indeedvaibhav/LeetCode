class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] result=new int[2*n];
       int index=0;
       for(int i=0;i<=n-1;i++)
       {
        result[index]=nums[i];
        index=index+1;

        result[index]=nums[i+n];
        index=index+1;
       }
       
        return result;
    }
}