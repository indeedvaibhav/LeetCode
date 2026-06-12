class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int start=0;
        int end=numbers.length-1;
        ArrayList<Integer> ans=new ArrayList<>();
        while(start<end)
        {
            int sum=numbers[start]+numbers[end];
            if(sum==target)
            {
                ans.add(start+1);
                ans.add(end+1);
                start++;
                end--;

            }
            else if(sum>target)
                end--;
            else
                start++;
        }
        return ans.stream().mapToInt(Integer::intValue).toArray(); 
        
    }
   
}