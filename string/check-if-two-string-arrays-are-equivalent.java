class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder ans1 = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();
        
        for(String word : word1){
            ans1.append(word);
        }
        for(String word : word2){
            ans2.append(word);
        }

        if(ans1.toString().equals(ans2.toString())) return true;
        return false;

        
    }
}