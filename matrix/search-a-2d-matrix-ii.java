class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int flag=0;
        int row=0,col=cols-1;
        while(row<rows && col>=0)
        {
            if(matrix[row][col]==target)
            {
                flag=1;
                break;

            }           
            else if(matrix[row][col]>target)
            col--;
            else 
            row++;
        }
        if(flag==1)
        return true;
        else 
        return false;
        
    }
}