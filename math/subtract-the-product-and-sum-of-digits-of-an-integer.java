class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;int prod=1,sum=0;
        while(temp!=0)
        {
            int x= temp%10;
            prod*=x;
            temp/=10;
        }
        while(n!=0)
        {
            int x= n%10;
            sum+=x;
            n/=10;
        }
        return prod-sum;
        
    }
}