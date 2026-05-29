class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) 
    {
        Scanner sc =new Scanner(System.in);
        int count=0;
     for(int i=0;i<arr.length;++i)
     {
        for(int j=i+1;j<arr.length;++j)
        {
            if( Math.abs(arr[i]-arr[j])<=a)
            {
            for(int k=j+1;k<arr.length;++k)
            {
                if(Math.abs(arr[j]-arr[k])<=b &&  Math.abs(arr[i]-arr[k])<=c)
                {
                    
                    ++count;
                }
            }
        }
         else
                System.out.println("no triplets satisfies all conditions.");
        }
     }
     return count;
    }
}
