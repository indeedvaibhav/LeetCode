class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;

        for(int i=0;i<=flowerbed.length-1;i++)
        {
            if(flowerbed[i]==0)
            {int left= (i==0) ? 0: flowerbed[i-1];
            int right= (i==flowerbed.length-1) ? 0: flowerbed[i+1];

            if(left==0 && right == 0)
            {
                count++;
                flowerbed[i]=1;
            }}
        }
        return count>=n;


    }
}