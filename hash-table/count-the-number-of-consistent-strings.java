class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
    boolean check = false;int count=0;
    for(int i= 0;i<words.length; i++){

            for(int j= 0; j<words[i].length() ;j++){
                char ch = words[i].charAt(j);
                if (allowed.contains(String.valueOf(ch)))
                    check= true;
                else{
                    check = false;
                    break;
                    }
            }
            if(check==true)
                    count++;
           
        }
return count;

        
    }
}