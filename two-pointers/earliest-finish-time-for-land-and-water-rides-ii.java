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
    public int calculate(int[] firstStartTime, int[] firstDuration, int[]secondStartTime,int[] secondduration)
    {
        int earliestFirstFinish = Integer.MAX_VALUE;

        for (int i = 0; i < firstStartTime.length; i++) {
            earliestFirstFinish = Math.min(
                    earliestFirstFinish,
                    firstStartTime[i] + firstDuration[i]
            );
        }
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < secondStart.length; i++) {
            int startSecond = Math.max(
                    earliestFirstFinish,
                    secondStart[i]
            );

            result = Math.min(
                    result,
                    startSecond + secondDuration[i]
            );
        }

        return result;
    }
} 