class Solution {
    public double angleClock(int hour, int minutes) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=12;i++)
            map.put(5*i,30*i);

        double hourAffected= minutes*0.5;
        double degree=0;
        if(minutes==0 ){
            if(hour==12)
             return 0;
            else
                degree=map.get(hour * 5);
        }
        else {
            if(hour==12) {
                degree = map.get(minutes);
            }
            else
                degree = Math.abs(map.get(hour * 5) - map.get(minutes));
        }
        return Math.abs(degree-hourAffected);
    }
}