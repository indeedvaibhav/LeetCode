class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result=new int[2*nums.length];
        int k=0;
        for(int i=0;i<=result.length-1;i++)
        {
            if(i>=nums.length)
            {
                result[i]=nums[k];
                k++;
            }
            else result[i]=nums[i];
        }
        return result;
    }
}