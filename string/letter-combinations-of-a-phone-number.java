class Solution {
    public List<String> letterCombinations(String digits) {
        String p = "";
        return combinations(p, digits);

    }

    static ArrayList<String> combinations(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '1';
        if (digit == 6 || digit == 8) {
            for (int i = (digit - 1) * 3; i <= (digit * 3); i++) {
                char ch = (char) ('a' + i);
                ans.addAll(combinations(p + ch, up.substring(1)));
            }
        }
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            ans.addAll(combinations(p + ch, up.substring(1)));
        }
        return ans;
    }
}