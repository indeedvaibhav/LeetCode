class Solution {
    public int maximumProduct(int[] nums) {
        int maxProd=1;

        if(nums.length==3)
        return nums[0]*nums[1]*nums[2];
        Arrays.sort(nums);

        int len=nums.length-1;
        return nums[len]*nums[len-1]*nums[len-2];
    }
}