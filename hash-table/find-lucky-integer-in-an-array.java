class Solution {
    public int findLucky(int[] arr) {
        List<Integer> freq=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==arr[i]) 
                count++;
            }
            if(count==arr[i])
            freq.add(count);
        }
        if(freq.size()<1)
        return -1;
        else
        return Collections.max(freq);
    }
}