class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];

        for (int i = 0; i < boxes.length(); i++) {
            
            for (int j = 0; j < boxes.length(); j++) {

                if (Math.abs(i - j) == 1 && boxes.charAt(j) != '0')
                    ans[i] += 1;
                else if (Math.abs(i - j) > 1 && boxes.charAt(j) != '0')
                    ans[i] += Math.abs(j-i);
            }
        }
        return ans;
    }
}