class Solution {
    public int countPartitions(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length-1;i++){
            int x=0;
            int left=0,right=0;
            while(x<=i){
                left += nums[x];x++;
            }
        
            while(x<=nums.length-1){
                right +=nums[x];x++;
            }
            if((Math.abs(left-right))%2==0)
                count++;


        }
        return count;
    }
}