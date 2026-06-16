class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer , String> map=new HashMap<>();
        int[] sorted= score.clone();
        Arrays.sort(sorted);
        String[] result= new String[sorted.length]; int len=sorted.length-1;
        if(score.length==1)
        {
            result[0]="Gold Medal";
            return result;
        }
        if (score.length == 2) {
    if (score[0] > score[1]) {
        result[0] = "Gold Medal";
        result[1] = "Silver Medal";
    } else {
        result[0] = "Silver Medal";
        result[1] = "Gold Medal";
    }
    return result;
}
        map.put(sorted[len],"Gold Medal");
        map.put(sorted[len-1],"Silver Medal");
        map.put(sorted[len-2],"Bronze Medal");
        for(int i=3;i<sorted.length;i++)
            map.put(sorted[len-i],(i+1)+"");


        for(int i=0;i<=score.length-1;i++)
        {
            result[i]=map.get(score[i]);

        }
        return result;
    }
}