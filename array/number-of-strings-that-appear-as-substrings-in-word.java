class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count =0 ;
        for(String val : patterns){
            if(word.contains(val))
                count++;
        }
        return count;
    }
}