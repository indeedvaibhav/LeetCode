class Solution {
    public int lengthOfLastWord(String s) {
         String text= s.stripTrailing();
        if(text.length()==1) return text.length();
        int count=0,i=text.length()-1;
        while(text.charAt(i)!=' ' && i>=0)
        {
            count++;
            if(i==0)
                break;
            else i--;
        }
        return count;
    }
}