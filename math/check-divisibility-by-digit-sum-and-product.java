class Solution {
    public boolean checkDivisibility(int n) {
        int x= sumOfdigits(n);
        int y= prodOfdigits(n);

        return (x+y)%n==0;
        
        
    }
    public int sumOfdigits(int num)
    {
        int temp=num;
        int sum=0;
        while(temp!=0)
        {
            int x=temp%10;
            sum+=x;
            temp=temp/10;
        }
        return sum;
    }
    public int prodOfdigits(int num)
    {
         int prod=1,temp=num;
        while(temp!=0)
        {
            int x=temp%10;
            prod*=x;
            temp=temp/10;
        }
        return prod;
    }
}