class Solution {
    public int lastRemaining(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++)
        list.add(i);

        return solve(list,false);
        
    }
    static int solve(ArrayList<Integer> list,boolean leftRight)
    {
        if(list.size()==1)
            return list.get(0);
        ArrayList<Integer> ans=new ArrayList<>();

        if(leftRight){
            for(int i=1;i<list.size()-1;i+=2)
            {
                ans.add(list.get(i));
            }
        }
        else
        {
            for(int i=list.size()-2;i>=0;i-=2)
            {
                ans.add(list.get(i));
            }
        }
        return solve(ans,!leftRight);
    }
}