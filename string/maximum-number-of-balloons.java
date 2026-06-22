class Solution {
    public int maxNumberOfBalloons(String text) {
        String s = "balon";

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            map.put(String.valueOf(text.charAt(i)),
                    map.getOrDefault(String.valueOf(text.charAt(i)), 0) + 1);
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {

            String ch = String.valueOf(s.charAt(i));

            if (!map.containsKey(ch))
                return 0;

            if (s.charAt(i) == 'l' || s.charAt(i) == 'o')
                min = Math.min(min, map.get(ch) / 2);
            else
                min = Math.min(min, map.get(ch));
        }

        return min;


    }
}