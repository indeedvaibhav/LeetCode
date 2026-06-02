class Solution {
    public List<String> letterCombinations(String digits) {
        String p = "";
        if (digits.isEmpty()) {
        return new ArrayList<>();
    }
        return combinations(p, digits);

    }

    static ArrayList<String> combinations(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        String[] map = {
                "", "",
                "abc", "def", "ghi",
                "jkl", "mno", "pqrs",
                "tuv", "wxyz"
        };
        ArrayList<String> ans = new ArrayList<>();
        String letters = map[up.charAt(0) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            ans.addAll(combinations(
                    p + letters.charAt(i),
                    up.substring(1)));
        }
        return ans;
    }
}