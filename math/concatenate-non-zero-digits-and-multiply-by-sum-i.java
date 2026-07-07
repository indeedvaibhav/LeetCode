class Solution {
    public long sumAndMultiply(int n) {
        String s=String.valueOf(n);
        StringBuilder ans = new StringBuilder();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='0')
                continue;
            else
            {
                sum+=Integer.parseInt(String.valueOf(ch));
                ans.append(ch);
            }
        }
        if(sum==0) return 0;
        else 
        return (long) sum *Integer.parseInt(String.valueOf(ans));
    }
}