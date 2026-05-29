class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(n<0)
        {
            x=1/x;
            N=Math.abs(N);
        }
        return calculate(x,N);
    }
    double calculate(double x,long n)
    {
        if(n==0) return 1;
        
            double half= calculate(x,n/2);
            if(n%2==0)
            return half * half;
            else
            return x*half*half;
        
    }
}