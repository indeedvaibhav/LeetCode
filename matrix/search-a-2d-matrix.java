class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
         int row = matrix.length;   
        int col = matrix[0].length; 
        int flag=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==target)
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1)
        return true;
        else
        return false;
    }
}