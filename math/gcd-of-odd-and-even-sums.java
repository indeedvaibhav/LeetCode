class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum=0,evenSum=0,gcd=Integer.MIN_VALUE;
        int odd=1,even=2;
        int x=n;
        while(n>=1)
        {
            evenSum+=even;
            oddSum+=odd;
            even+=2;
            odd+=2;
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