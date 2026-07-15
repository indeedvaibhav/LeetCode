class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum=1,evenSum=2,gcd=Integer.MIN_VALUE;
        
        int x=n;
        while(n>=1)
        {
            evenSum+=2;
            oddSum+=2;
            n--;
        }
        for(int k=1;k<=x;k++)
        {
            if(evenSum%k==0 && oddSum%k==0)
                gcd=Math.max(gcd,k);
        }
        return gcd;
    }
}