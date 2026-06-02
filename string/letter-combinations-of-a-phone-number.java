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
        if (up.charAt(0)=='7' || up.charAt(0)=='9') {
            for (int i = (digit - 1) * 3; i < (digit * 3)+1; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(combinations(p + ch, up.substring(1)));
            }
        }
        else
        {for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            ans.addAll(combinations(p + ch, up.substring(1)));
        }}
        return ans;
    }
}