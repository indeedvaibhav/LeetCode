class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        List<Integer> ans = new ArrayList<>();

        for(int q : queries){

            List<Integer> list = map.get(nums[q]);

            if(list.size()==1){
                ans.add(-1);
                continue;
            }

            int pos = Collections.binarySearch(list,q);

            int prev = list.get((pos-1+list.size())%list.size());
            int next = list.get((pos+1)%list.size());

            int d1 = Math.min(Math.abs(q-prev), n-Math.abs(q-prev));
            int d2 = Math.min(Math.abs(q-next), n-Math.abs(q-next));

            ans.add(Math.min(d1,d2));
        }

        return ans;
    }
}