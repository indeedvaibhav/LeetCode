class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans=Integer.MAX_VALUE,i=0;
        for(int dist=0;dist<nums.length;dist++)
        {
            if((start-dist)>=0 && nums[start-dist]==target)
            return dist;
            if((start+dist)<=nums.length-1 && nums[start+dist]==target)
            return dist;
        }
        return -1;
    }
}