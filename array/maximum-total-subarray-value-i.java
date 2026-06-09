class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int i=0;
        long min = Arrays.stream(nums).min().getAsInt();
        long max = Arrays.stream(nums).max().getAsInt();
       return (long)(max-min)*k;
        
    }
}