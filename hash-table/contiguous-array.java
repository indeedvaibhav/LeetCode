class Solution {
    public int findMaxLength(int[] nums) {
        int length=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                nums[i]=-1;
            if(nums[i]==1)
                nums[i]=1;
        }


        int[] sum=nums.clone();
        for(int i=1;i<sum.length;i++)
            sum[i]+=sum[i-1];

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for (int currentIndex = 0; currentIndex < sum.length; currentIndex++)
        {
            if(!map.containsKey(sum[currentIndex])) {
                map.put(sum[currentIndex],currentIndex);

            }
            else {
                length = Math.max(length,currentIndex - map.get(sum[currentIndex]));
            }


        }
        return length;
    }
}