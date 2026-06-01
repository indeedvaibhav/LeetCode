class Solution {
    public String getPermutation(int n, int k) {
        String p="";String up="";
        for(int i=0;i<n;i++)
        up=up+i;
        return permutationIndex(p,up,k);
        
    }
    static String permutationIndex(String p,String up,int k)
    {
        if(up.isEmpty())
        return p;

        char ch=up.charAt(0);
        
        ArrayList<String> ans= new ArrayList<>();
        for(int i=0;i<=p.length();i++)
        {
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            ans.addAll(permutationIndex(first+ch+second,up.substring(1)),k);
        }
        String result=ans.get(k);
        return result;
    }
}