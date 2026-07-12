class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                stack.push(ch);
            }
            if (!stack.isEmpty() && (map.get(stack.peek())) == ch) {
                stack.pop();
                count+=2;

            }

        }
        return count;
    }
}