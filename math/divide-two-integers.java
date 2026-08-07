class Solution {
    public int divide(int dividend, int divisor) {
        int i=1;
        while(divisor<=dividend)
{            divisor*=i;i++;
}
        return i;
        
    }
}