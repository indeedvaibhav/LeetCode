class Solution {
    public int reverseDegree(String s) {
        int k=0;
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i= 26;i>0;i--){
            char ch = (char)('a'+ k);
            map.put(ch, i);
            k++;
        }
        int sum=0;
        for(int i = 0;i<s.length();i++)
        {
            int x = map.get(s.charAt(i))*(i+1);
            sum+= x;
            
        }
        return sum;
    }
}