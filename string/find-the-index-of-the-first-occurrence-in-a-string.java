class Solution {
    public int strStr(String haystack, String needle) {
         int n=haystack.length();
         int m=needle.length();
        for(int i=0;i<=n-m;i++)
        {
            String str=haystack.substring(i,i+m);
            if(str.equals(needle))
            {
                int pos=i;
                return pos;
            }
        }
        return -1;
    }
}