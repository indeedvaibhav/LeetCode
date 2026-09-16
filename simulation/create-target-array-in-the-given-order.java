class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();

        for(int i =0 ; i< index.length;i++)
        {
            int indx = index[i];
            target.add(indx, nums[i]);
        }
        return target.stream().mapToInt(Integer::intValue).toArray();
    }
}