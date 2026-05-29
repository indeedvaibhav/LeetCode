class Solution {
    public int countPalindromicSubsequence(String s) {
        int count=0;
        for(char ch='a';ch<='z';ch++)
        {
            int first=-1;
            int last=-1;

            //for first index 
            for(int i=0;i<=s.length()-1;i++)
            {
                if(ch==s.charAt(i))
                {
                    first=i;
                    break;
                }
            }
            //for the last index
            for(int i=s.length()-1;i>=0;i--)
            {
                if(ch==s.charAt(i))
                {
                    last=i;
                    break;
                }
            }

            if(first!=-1 && last!=-1 && first<last)
           { 
            Set<Character> middle=new HashSet<>();

            for(int i=first+1;i<last;i++)
            {
                middle.add(s.charAt(i));
            }
            count+=middle.size();
        }
    }
        return count;
    }        
            
}
        
    
