class Solution {
    public int maxScore(String s) {
        ArrayList<Integer> ans= new ArrayList<>();

        for(int i=0;i<s.length();i++)
        {
            int count=0,k=0;
            String zeros= s.substring(0,i+1);
            String ones= s.substring(i+1,s.length());
            while(k<zeros.length() || k<ones.length())
            {
                if(k<zeros.length())
                {
                    if(zeros.charAt(k)=='0')
                        count++;
                }
                if(k<ones.length())
                {
                    if(ones.charAt(k)=='1')
                        count++;
                }
                k++;
            }
            ans.add(count);
        }
        return Collections.max(ans);
        
    }
}