class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++)
            map.put(list1[i], i);

        ArrayList<String> ans = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        int index = 0;

        for (String word : list2) {
            if (map.containsKey(word)) {
                int sum = map.get(word) + index;

                if (sum < minSum) {
                    minSum = sum;
                    ans.clear();
                    ans.add(word);
                } else if (sum == minSum) {
                    ans.add(word);
                }
            }
            index++;
        }

        return ans.toArray(new String[0]);
    }
}