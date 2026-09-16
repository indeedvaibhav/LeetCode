class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();
        for(int i =0; i < word.length();i++){
            index = word.indexOf(ch);
            if(index == -1) return word;

            while(index!=0){
                ans.append(word.charAt(index));
                index--;
            }

        }
        String res = ans.toString();
            res = res + word.substring(index+1);
            return res ;
    }
}