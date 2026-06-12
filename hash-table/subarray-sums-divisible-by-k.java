class Solution {
    public int subarraySumHash(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    map.put(0, 1);

    int prefixSum = 0;
    int count = 0;

    for (int num : nums) {
        prefixSum += num;

        int rem = ((prefixSum % k) + k) % k;

        if (map.containsKey(rem)) {
            count += map.get(rem);
        }

        map.put(rem, map.getOrDefault(rem, 0) + 1);
    }

    return count;
}
}