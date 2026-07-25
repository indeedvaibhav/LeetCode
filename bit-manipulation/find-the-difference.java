class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Integer,Character> map= new HashMap<>();
        char ans = 0;
        if(s.length()<t.length())
        {
            for(int i=0;i<s.length();i++)
            {
                map.put(i,s.charAt(i));
            }
            for(int i=0;i<t.length();i++)
            {
                if(!map.containsValue(t.charAt(i)))
                {
                    ans=t.charAt(i);
                }
                else ans=t.charAt(0);
            }
        }
        else {
            for (int i = 0; i < t.length(); i++) {
                map.put(i, t.charAt(i));
            }
            for(int i=0;i<s.length();i++)
            {
                if(!map.containsValue(s.charAt(i)))
                {
                    ans=s.charAt(i);

                }
                else ans=s.charAt(0);

            }
        }
        return ans;
    }
}