class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> Set = new HashSet<>();
        boolean[] used = new boolean[digits.length];

        backtracking(digits, used, "", set);
        int[] ans = set.stream().mapToInt(Integer::intValue).sorted().toArray();

        return ans;
    }

    static int backtracking(int[] digits, boolean[] used, String current, HashSet<Integer> set) {
        if (current.length == 3) {
            int num = Integer.parseInt(current);
            if (current.charAt(0) == '0' && num % 2 == 0) {
                set.add(num);
            }
            return;
        }
        for (int i = 0; i < digits.length; i++) {
            if (used[i])
                continue;

            used[i] = true;
            backtracking(digits, used, current + digits[i], set);
            used[i] = false;
        }

    }

}