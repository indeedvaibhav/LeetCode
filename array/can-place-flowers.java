class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean ans=false;
        int i=1;
        int sum=0;int count=0;
        if(n==0)
        return false;
        while(i<flowerbed.length-1)
        {
            sum=flowerbed[i-1]+flowerbed[i+1];
            if(sum==0)
            {
                count++;
                flowerbed[i]=1;
            }
            sum=0;
            i++;

        }
        if(count==n)
            return true;

        return false;
    }
}