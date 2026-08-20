class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(arr1.size()==0 && arr2.size()==0)
            {
                arr1.add(nums[i]);
                arr2.add(nums[i+1]);i++;
            }
            else if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1))
                arr1.add(nums[i]);
            else
                arr2.add(nums[i]);
            
        }
        arr1.addAll(arr2);
        return arr1.stream().mapToInt(i -> i).toArray();
    }
}