class Solution {
    public int earliestTime(int[][] tasks) {
        int earliest = Integer.MAX_VALUE;
        for(int i = 0; i< tasks.length ; i++){
            int total = 0;
            for(int j = 0;j< tasks[0].length ; j++){
                total += tasks[i][j];
            }
            earliest = Math.min(earliest, total);
        }

        return earliest;
    }
}