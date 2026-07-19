class Solution {
    public String smallestSubsequence(String s) {
        int[] lastOccurrence = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i; 
        }

        boolean[] inStack = new boolean[26];
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int charIndex = c - 'a';

            if (inStack[charIndex]) continue;

            
            while (stack.length() > 0 && stack.charAt(stack.length() - 1) > c 
                   && lastOccurrence[stack.charAt(stack.length() - 1) - 'a'] > i) {
                inStack[stack.charAt(stack.length() - 1) - 'a'] = false;
                stack.deleteCharAt(stack.length() - 1);
            }

            stack.append(c);
            inStack[charIndex] = true;
        }

        return stack.toString();
    }
}
