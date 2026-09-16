class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();
        

            int index = word.indexOf(ch);
            if(index == -1) return word;
            int j=index;
            while(j!=-1){
                ans.append(word.charAt(j));
                j--;
            }
            while((index+1)!=word.length()){
                ans.append(word.charAt(index+1));
                index++;
            }
            return ans.toString();
    }
}