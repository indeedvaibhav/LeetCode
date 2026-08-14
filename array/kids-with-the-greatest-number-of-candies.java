class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max= Integer.MIN_VALUE;
        for(int num: candies)
        {
            max= Math.max(max,num);
            
        }
        for(int i=0;i<candies.length;i++)
        {
            
            candies[i]+=extraCandies;
        }
        ArrayList<Boolean> ans= new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            if(max<=candies[i])
            ans.add(true);
            else
            ans.add(false);
        }
        return ans;

    }
}