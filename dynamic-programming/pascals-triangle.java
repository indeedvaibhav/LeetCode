class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        int i,j;

        List<List<Integer>> ans = new ArrayList<>();

        for(i=0;i<numRows;i++)
        {

            List<Integer> currentRow=new ArrayList<>(i+1);
            List<Integer> previousRow = null;

            if(i > 0)
            {
                previousRow = ans.get(i - 1);
            }
            currentRow.add(1);
            if(i>0) {
                {
                    for (j = 0; j < previousRow.size() - 1; j++) {
                        currentRow.add(previousRow.get(j) + previousRow.get(j + 1));

                    }
                }
            }
            if(i > 0)
            {
                currentRow.add(1);
            }
            ans.add(currentRow);
        }

return ans;
        
    }
}