class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set=new HashSet<>();
        boolean[] used=new boolean[digits.length];
        backtracking(digits,used,"",set);
        return set.size();
        
    }
    static void backtracking(int[] digits,boolean[] used,String current,HashSet<Integer> set)
    {
        if(current.length()==3)
        {
            int number=Integer.parseInt(current);
            if(current.charAt(0)!='0' && number%2==0) {
                set.add(number);
            }
            return;
        }
        for(int i=0;i<digits.length;i++)
        {
            if(used[i]) continue;

            used[i]=true;

            backtracking(digits,used,current+digits[i],set);
            used[i]=false;
        }

    }
}