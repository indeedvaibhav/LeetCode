class Solution {
    public void sortColors(int[] nums) {
        int[] c= new int[3];

        for(int i=0;i<nums.length;i++)
            c[nums[i]]++;

        for(int i =1 ;i<c.length;i++)
            c[i]=c[i]+c[i-1];

        int[] b= new int[nums.length];
        for(int i=nums.length-1;i>=0;i--)
        {
            b[c[nums[i]]]= nums[i];
            c[nums[i]]= c[nums[i]]-1;
        }

        for(int i=0;i<nums.length;i++)
        {
            nums[i]=b[i];
        }
        
    }
}