class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newstr = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newstr.append(Character.toLowerCase(c));
            }
        }

        String clear = newstr.toString();
        String reversed = newstr.reverse().toString();
        if(clear.equals(reversed))
        return true;
        else
        return false;
    }
}