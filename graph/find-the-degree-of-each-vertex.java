class Solution {
    public int[] findDegrees(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i< matrix.length ; i++){
            int sum = 0;
            for(int j=0 ; j<matrix[0].length ; j++){

                sum += matrix[i][j];
            }
            ans.add(sum);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}