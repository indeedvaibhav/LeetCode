class Solution {
    public int mirrorDistance(int n) {
        int temp= n;
        int rev=0;
        while(temp!=0)
        {
            int x = temp%10;
            rev= x+rev*10;
            temp/=10;
        }
        return Math.abs(n-rev);
        
    }
}