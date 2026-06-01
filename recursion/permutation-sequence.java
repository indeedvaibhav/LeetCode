class Solution {
    public String getPermutation(int n, int k) {
        String p="";String up="";
        for(int i=1;i<=n;i++)
        up=up+i;
        ArrayList<String>result= permutationIndex(p,up);
        return result.get(k);
    }
    static ArrayList<String> permutationIndex(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);
        
        ArrayList<String> ans= new ArrayList<>();
        for(int i=0;i<=p.length();i++)
        {
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            ans.addAll(permutationIndex(first+ch+second,up.substring(1),k));
        }
        return ans;
    }
}