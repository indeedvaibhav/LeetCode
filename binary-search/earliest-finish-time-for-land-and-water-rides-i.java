class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int earliest1 = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < landStartTime.length; i++) {
            int endtime = landStartTime[i] + landDuration[i];
            for (int j = 0; j < waterStartTime.length; j++) {
                endtime += waterDuration[j];
            }
            if (endtime < earliest1)
                earliest1 = endtime;
            endtime = 0;
        }
        int earliest2 = Integer.MAX_VALUE;

        for (int i = 0; i < waterStartTime.length; i++) {
            int endtime = waterStartTime[i] + waterDuration[i];
            for (int j = 0; j < landStartTime.length; j++) {
                endtime += landDuration[i];
                if (endtime < earliest2)
                    earliest2 = endtime;
                endtime -= landDuration[i];
            }
        }
        if (earliest1 < earliest2)
                return earliest1;

            return earliest2;
    }
}