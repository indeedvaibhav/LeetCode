class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character , Integer> map= new HashMap<>();
        int VowelMax = 0,ConsMax= 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(int i = 0 ; i<s.length();i++){

            char ch =s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
               { 
                    int x= map.get(ch);
                    VowelMax = Math.max(VowelMax,x);
                }
            else
                { 
                    int x= map.get(ch);
                    ConsMax = Math.max(ConsMax,x);
                }
        }
        return ConsMax + VowelMax;
    }
}