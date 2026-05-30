class Solution {
    TreeSet<Integer> obstacles= new TreeSet<>();
    List<Boolean> result=new ArrayList<>();   
    public List<Boolean> getResults(int[][] queries) {
        
        return check(queries);

        
    }
    public List<Boolean> check(int[][] queries)
    {
        for(int[] row: queries)
        {
            if(row[0]==1)
            {
                obstacles.add(row[1]);
            }

            else
            {
                int prev=0;
                boolean canPlace=false;
                for(int obs: obstacles)
                {
                    int gap=obs-prev;
                    if(obs<=row[1])
                    {
                        if(gap>=row[2])
                        {
                            canPlace=true;
                            break;
                        }
                        prev=obs;
                    }
                    else 
                    break;
                }
                if(row[1] - prev >= row[2])
                {
                    canPlace = true;
                }
                result.add(canPlace);  
            }
            
        }
        return result;
    
    }
}