class Solution {
    public int islandPerimeter(int[][] grid) {
       int peri=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                    peri+=4;

                if(i>0 && j>0)
                {
                    if(grid[i-1][j] ==1 && grid[i][j-1]==1)
                        peri-=4;
                }
            }
        }
        return peri;
    }
}