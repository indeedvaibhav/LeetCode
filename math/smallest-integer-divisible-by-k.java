class Solution {
    public int smallestRepunitDivByK(int k) {
                int remainder = 0;int length;
        if(k%2==0 || k%5==0)
        return -1;
        else
        for ( length = 1; length <= k; length++) {
            remainder = (remainder * 10 + 1) % k;
            if (remainder == 0) break;
    }
    return length;
}
}