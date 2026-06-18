class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int rowMin= Integer.MAX_VALUE;
        int colMin=Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++)
        {

                rowMin=Math.min(rowMin,ops[i][0]);
                colMin=Math.min(colMin,ops[0][i]);

        }
        return rowMin*colMin;
    }
}