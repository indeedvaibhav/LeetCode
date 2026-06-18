class Solution {
    public double angleClock(int hour, int minutes) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=12;i++)
            map.put(5*i,30*i);

        double hourAffected= minutes*0.5;

        double degree= Math.abs(map.get(hour*5)-map.get(minutes));
        return Math.abs(degree-hourAffected);
    }
}