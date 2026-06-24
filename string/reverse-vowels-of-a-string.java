class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> vowel = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' ||
                s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' ||
                s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                s.charAt(i) == 'u') {

                vowel.add(s.charAt(i));
            }
        }

        StringBuilder ans = new StringBuilder();
        int x = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' ||
                s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' ||
                s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                s.charAt(i) == 'u') {

                ans.append(vowel.get(vowel.size() - x - 1));
                x++;
            } else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}