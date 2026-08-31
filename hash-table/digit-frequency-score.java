class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp = n;
        while (temp != 0) {
            int x = temp % 10;
            map.put(x, map.getOrDefault(x, 0) + 1);
            temp /= 10;
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int x= entry.getKey() * entry.getValue();
            ans+=x;

        }
        return ans;

    }
}