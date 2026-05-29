class Solution {
    public long kMirror(int k, int n) {
        long sum=0;
        int count=0;

        for(int length=1;count<n;length++)    
        {
            int half=(length+1)/2;

            long start=(long)Math.pow(10,half-1);
            long end=(long)Math.pow(10,half)-1;
            if(length==1) start=1;
            for(long seed=start;seed<=end && count<n ;seed++)
            {
                long palindrome= (length%2==0)? palindromeEven(seed) : palindromeOdd(seed);
                if(isBasePalindrome(palindrome,k))
                {sum+=palindrome;
                count++;}
            }
        }
        return sum;
    }
    
    long palindromeEven(long n)
    {
        String s=String.valueOf(n);
        String r=new StringBuilder(s).reverse().toString();
        return Long.parseLong(s+r);
    }
    long palindromeOdd(long n)
    {
        String s=String.valueOf(n);
        String left=s.substring(0,s.length()-1);
        String r=new StringBuilder(left).reverse().toString();
        return Long.parseLong(s+r);
    }
    boolean isBasePalindrome(long x,int k)
    {
        StringBuilder sb=new StringBuilder();
        while(x>0)
        {
            sb.append(x%k);
            x=x/k;
        }
        String s=sb.toString();
        return s.equals(sb.reverse().toString());
    }
}

    