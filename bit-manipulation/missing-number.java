class Solution {
    public int missingNumber(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],i);

        int ans=0;
        for(int i=0;i<=map.size();i++)
        {
            if(!map.containsKey(i)) {
                ans=i;
                break;

            }
            else
                continue;
        }
        return ans; 
    }
}