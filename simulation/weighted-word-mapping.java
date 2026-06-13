class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<26;i++)
        {
            char ch=(char)('z'-i);
            map.put(ch,i);
        }

        HashMap<Character,Integer> wordWeight= new HashMap<>();
        for(int i=0;i< weights.length;i++)
        {
            char ch=(char)('a'+i);
            wordWeight.put(ch,weights[i]);
        }


        StringBuilder ans = new StringBuilder();

        for(int x=0;x<words.length;x++)
        {
            int sum=0;
            String temp=words[x];
            for(int i=0;i<temp.length();i++)
            {
                char letter= temp.charAt(i);
                if(wordWeight.containsKey(letter))
                {
                    int val=wordWeight.get(letter);
                    sum+=val;
                }
            }
            int targetIndex = sum % 26;

            if (targetIndex < 0) {
                targetIndex += 26;
            }

            char targetLetter = (char) ('z' - targetIndex);

            if (map.containsKey(targetLetter)) {
                ans.append(targetLetter);
            }
            }
        return ans.toString();
        
    }
}