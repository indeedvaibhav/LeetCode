class Solution {
    public String lexGreaterPermutation(String s, String target) {
        Set<String> strings = permutation(s, "");
        String ans = "";

        for (String str : strings) {
            if (str.compareTo(target) > 0) {
                ans = str;
                break;
            }
        }

        return ans;
    }

    public Set<String> permutation(String up, String s) {
        Set<String> set = new TreeSet<>();

        if (up.isEmpty()) {
            set.add(s);
            return set;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= s.length(); i++) {
            String first = s.substring(0, i);
            String second = s.substring(i);

            set.addAll(
                permutation(up.substring(1), first + ch + second)
            );
        }

        return set;
    }
}