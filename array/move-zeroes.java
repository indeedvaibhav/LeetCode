class Solution {
    public void moveZeroes(int[] nums) {
       ArrayList<Integer> leftEnd=new ArrayList<>();
        ArrayList<Integer> rightEnd=new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                rightEnd.add(nums[i]);
            else
                leftEnd.add(nums[i]);
        }
        leftEnd.addAll(rightEnd);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = leftEnd.get(i);
        }
        System.out.println(Arrays.toString(nums));
    }
}