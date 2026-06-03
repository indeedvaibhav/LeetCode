class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
         int landFirst = calculate(
                landStartTime, landDuration,
                waterStartTime, waterDuration
        );

        int waterFirst = calculate(
                waterStartTime, waterDuration,
                landStartTime, landDuration
        );

        return Math.min(landFirst, waterFirst);
    }
    public int earliest(int[] firstStartTime, int[] firstDuration, int[]secondStartTime,int[] secondduration)
    {
        int earliesttime=Integer.MAX_VALUE;
        for(int i=0;i<firstStartTime;i++)
        {
            earliesttime=Math.min(earliesttime,firstStartTime[i]+firstDuration[]);
        }
        int result=Integer.MAX_VALUE;
        for(int i=0;i<secondStartTime;i++)
        {
            int secondstart=Math.max(secondStartTime[i],earliesttime);

            result = Math.min(
                    result,
                    startSecond + secondDuration[i]
            );
        }
        return result;
    }
} 