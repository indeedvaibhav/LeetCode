import java.util.ArrayList;
import java.util.Collections;

public class elimination {
    public static void main(String[] args) {
        int n=9;
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=1;i<=n;i++)
            numbers.add(i);
        System.out.println(solve(numbers,true));

    }

    static int solve(ArrayList<Integer> list,boolean leftRight)
    {
        if(list.size()==1)
            return list.get(0);
        ArrayList<Integer> ans=new ArrayList<>();

        if(leftRight){
            for(int i=1;i<list.size();i+=2)
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
            Collections.reverse(ans);
        }
        return solve(ans,!leftRight);
    }
}
