class Solution {
    public List<String> summaryRanges(int[] nums) {
        boolean flag= false;
        List<String> ans=new ArrayList<>();
        StringBuilder s= new StringBuilder();
        for(int i=0;i<nums.length;i++)
        {
            if((i+1)< nums.length)
            {
                int diff=Math.abs(nums[i]-nums[i+1]);
                if(diff==1)
                {
                    if(!flag) {
                        s = new StringBuilder(nums[i] + "->");
                        flag=true;
                    }
                    else continue;
                }
                else {
                    s.append(nums[i]);
                    ans.add(s.toString());
                    s = new StringBuilder();
                    flag=false;
                }
            }
            else ans.add(s+String.valueOf(nums[i]));
        }
        return ans;
    }
}