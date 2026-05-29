class Solution {
    Boolean dp[][];
    public boolean isMatch(String s, String p) {
        dp= new Boolean[s.length()+1][p.length()+1];        
        return wildcard(s,p,0,0);
        
    }
    public boolean wildcard(String s,String p,int i,int j)
    {
        if(j==p.length())
        return i==s.length();

        if(dp[i][j]!=null)
        return dp[i][j];

        boolean ans;
        if(p.charAt(j)=='*' )
        {
            ans = wildcard(s,p,i,j+1) ||  (i<s.length() && wildcard(s,p,i+1,j)); 
        }
        else
        {
            boolean match= (i<s.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='?' ));
            ans= match && wildcard(s,p,i+1,j+1);
        }
        dp[i][j]=ans;
        return ans;
    }
}