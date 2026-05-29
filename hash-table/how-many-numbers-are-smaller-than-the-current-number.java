class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> result= new ArrayList<>();
        for(int i=0;i<=nums.length-1;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j]) count++;
            }
            result.add(count);
        }
int[] arr = new int[result.size()];
for(int i=0; i<result.size(); i++)
    arr[i] = result.get(i);
return arr;
    }

}