class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];int x=0;
            while(temp!=0)
            {
                int num=temp%10;
                x=x+num;
                temp=temp/10;
            }
            nums[i]=x;
        }
        int min = nums[0]; 
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] < min) {
            min = nums[i]; 
        }
    }
    return min;
    }
}