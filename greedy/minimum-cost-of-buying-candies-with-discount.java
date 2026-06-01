class Solution {
    public int minimumCost(int[] cost) {
        int total=0;
        int i=0;
        if(arr.length==1) return arr[0];
        if(arr.length==2) total=arr[0]+arr[1];
        arr = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();        while(i<arr.length && (i+1)<=arr.length)
        {
            int sum= arr[i]+arr[i+1];
            total=total+sum;

            if((i+3)<=arr.length)
                i+=3;
        }
        return total;
        
    }
}