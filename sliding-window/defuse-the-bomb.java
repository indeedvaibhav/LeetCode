class Solution {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int i = 0;
        int[] result = new int[len];
        for (i = i % len; i < len; i++) {
            int decrpted = 0, x = k;
            if (k > 0) {
                int j = i + 1;
                while (x > 0) {
                    decrpted += code[(j % len)];
                    x--;
                    j++;
                }
            }
            if (k < 0) {

                int j =(len+i-1)%len;
                while (x < 0) {
                    decrpted += code[j];
                    x++;
                    j--;
                    if(j<0) {
                        j = (len - 1) % len;
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