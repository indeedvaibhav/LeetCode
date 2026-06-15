class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i< nums1.length;i++)
        {
            for(int j=0;j< nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    int val=check(j,nums2);
                    ans.add(val);
                    break;
                }
                else
                    continue;
            }

        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
    static int check(int j,int[] nums2)
    {
        int ans=nums2[j];
        while(j< nums2.length)
        {
            if(nums2[j]>ans) {
                return nums2[j];
            }
            j++;
        }
        return -1;
    }

}