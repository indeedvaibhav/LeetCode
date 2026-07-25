import java.util.HashMap;

class Solution {
    public char findTheDifference(String s, String t) {
       
        HashMap<Character, Integer> mapS = buildFrequencyMap(s);
        HashMap<Character, Integer> mapT = buildFrequencyMap(t);

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            
            if (!mapS.containsKey(ch) || mapT.get(ch) > mapS.get(ch)) {
                return ch;
            }
        }
        
        return ' ';
    }

    private HashMap<Character, Integer> buildFrequencyMap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
}
