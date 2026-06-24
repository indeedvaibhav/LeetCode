class Solution {
    public int lengthOfLastWord(String s) {
        String text= s.strip();
        if(text.length()==1) return text;
        int count=0,i=text.length()-1;
        while(text.charAt(i)!=' ')
        {
            count++;
            i--;
        }
        return count;
    }
}