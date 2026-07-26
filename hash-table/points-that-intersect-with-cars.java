class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> set= new HashSet<>();

        for(int i=0;i<nums.size();i++)
        {
            List<Integer> currentRow = nums.get(i);
            for (int j = currentRow.get(0); j <= currentRow.get(1); j++)
            {
                set.add(j);
            }
        }
        return set.size();
    }
}