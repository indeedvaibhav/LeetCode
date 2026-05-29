class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int n : nums) {
            set.add(n);
        }

        List<Integer> missing = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) { 
                missing.add(i);
            }
        }

        return missing;
    }
}
