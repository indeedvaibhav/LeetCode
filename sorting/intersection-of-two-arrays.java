
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                ans.add(num);
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}