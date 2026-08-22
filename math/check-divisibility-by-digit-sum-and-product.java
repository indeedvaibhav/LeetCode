class Solution {
    public boolean checkDivisibility(int n) {
        int x= sumOfdigits(n);
        int y= prodOfdigits(n);
        
        return n%(x+y)==0;
        
        
    }
    public int sumOfdigits(int temp)
    {

        int sum=0;
        while(temp!=0)
        {
            int x=temp%10;
            sum+=x;
            temp=temp/10;
        }
        return sum;
    }
    public int prodOfdigits(int temp)
    {
         int prod=1;
        while(temp!=0)
        {
            int x=temp%10;
            prod*=x;
            temp=temp/10;
        }
        return prod;
    }
}