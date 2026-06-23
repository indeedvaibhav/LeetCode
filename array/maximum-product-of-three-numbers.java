class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length<3) return -1;

        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int secondMax=nums[nums.length-2];
        int thirdMax=nums[nums.length-3];
        int min=nums[0];
        int secondMin=nums[1];

        return Math.max(max*secondMax*thirdMax,min*secondMin*max);
        

    }
}