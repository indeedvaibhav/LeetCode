class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums2[j]==nums1[i])
                    arr.add(nums2[j]);


            }

        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
        
    }
}