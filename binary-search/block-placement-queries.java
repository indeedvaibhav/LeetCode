class Solution {
    TreeSet<Integer> obstacles= new TreeSet<>();
    ArrayList<Boolean> result= new ArrayList<>();
    int i=0;
    public List<Boolean> getResults(int[][] queries) {
        for()
        return check(queries);

        
    }
    public boolean[] check(int[][] queries)
    {
        int prev=0;
        for(int[] row: queries)
        {
            if(row[0]==1)
            {
                obstacles.add(row[1]);
            }

            else
            {
                boolean canPlace=false;
                for(int obs: obstacles)
                {
                    int gap=obs-prev;
                    if(obs<=row[0])
                    {
                        else if(gap>=row[2])
                        canPlace=true;
                        prev=obs;
                    }
                    else 
                    break;
                }
                result.add(canPlace);  
            }
            
        }
        return result;
    
    }
}