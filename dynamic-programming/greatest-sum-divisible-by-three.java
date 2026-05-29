class Solution {
    public int maxSumDivThree(int[] nums) {
        List<Integer> g1= new ArrayList<>();
        List<Integer> g2= new ArrayList<>();
        List<Integer> g3= new ArrayList<>();
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%3==0)g1.add(nums[i]);
            else if(nums[i]%3==1)g2.add(nums[i]);
            else
            g3.add(nums[i]);
        }
        Collections.sort(g2);
        Collections.sort(g3);

        int j=0;
        while(j<nums.length)
        {
            sum+=nums[j];
            j++;
        }
        if(sum%3==0) return sum;

        else if(sum%3==1)
        {
            if(g2.isEmpty())
            {
                sum=sum-g3.get(0)-g3.get(1);
            }
            else if(g3.size()<2) sum=sum-Collections.min(g2);
            else
            {
        int option1 = Collections.min(g2);
        int option2 = g3.get(0) + g3.get(1);

        sum = sum - Math.min(option1, option2);

        }
        }
        else
        {
            if(g3.isEmpty())
            {
                sum=sum-g2.get(0)-g2.get(1);
            }
            else if(g2.size()<2) sum=sum-Collections.min(g3);
            else
            {
        int option1 = Collections.min(g3);
        int option2 = g2.get(0) + g2.get(1);

        sum = sum - Math.min(option1, option2);

        }
        
    }
    return sum;

}
}
