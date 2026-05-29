class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=0;
        return check(n,i);
    }
    boolean check(int n,int i)
    {
        if(n==0)
        return false;
        
        if(Math.pow(2,i)<n)
        {
            if(Math.pow(2,i)!=n)
            {
                i=i+1;
                return check(n,i);
            }
        }
        else if(Math.pow(2,i)==n)
        {
            return true;
        }
        return false;
    }
}