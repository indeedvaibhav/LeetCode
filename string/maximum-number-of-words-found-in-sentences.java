class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount= Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++)
        {
            int count=0;
            String s= sentences[i];
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==' ')
                count++;
            }
            maxCount= Math.max(maxCount,count);
        }
        return maxCount;
        
    }
}