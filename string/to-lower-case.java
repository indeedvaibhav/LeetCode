class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isUpperCase(c)) {
                ans.append(Character.toLowerCase(c));
            } else {
                ans.append(c);
            }
        }
        
        return ans.toString(); 
    }
}
