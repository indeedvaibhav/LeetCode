class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        int length=1 << k;
        for(int i=0;i<s.length()-k+1;i++)
        {
            String newstr=s.substring(i,k+i);
            set.add(newstr);
        }
        if(set.size()<length)
        {
            return false;
        }
        return true;
    }
}