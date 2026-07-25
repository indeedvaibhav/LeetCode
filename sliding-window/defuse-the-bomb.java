class Solution {
    public int[] decrypt(int[] code, int k) {
        int i = 0;
        int[] result = new int[code.length];
        for (i = i % code.length; i < code.length; i++) {
            int decrpted = 0, x = k;
            if (k > 0) {
                int j = i + 1;
                while (x > 0) {
                    decrpted += code[(j % code.length)];
                    x--;
                    j++;
                }
            }
            if (k < 0) {

                int j =(code.length+i-1)%code.length;
                while (x < 0) {
                    decrpted += code[j];
                    x++;
                    j--;
                    if(j<0) {
                        j = (code.length - 1) % code.length;
                    }
                }
            }
            if (k == 0) {

                decrpted = 0;
            }
            result[i] = decrpted;
        }
        return result;
    }
}