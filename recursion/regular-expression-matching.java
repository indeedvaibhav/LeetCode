class Solution {
    public boolean isMatch(String s, String p) {
        int i=0;
        int j=0;
        return check(s,p,i,j);
        
    }
    static boolean check(String s, String p, int i, int j)
    {
        if(j==p.length())
        return i==s.length();

        boolean match= (i<s.length()) && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.');

        if(j+1 < p.length() && p.charAt(j+1)=='*')
        {
            return check(s,p,i,j+2) || (match && check(s,p,i+1,j));
        }
        return match && check(s,p,i+1,j+1);
    }
}