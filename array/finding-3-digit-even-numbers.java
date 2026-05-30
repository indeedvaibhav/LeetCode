class Solution {
    HashSet<Integer> ans = new HashSet<>();
    

    public int[] findEvenNumbers(int[] digits) 
    {
        String s="";
        boolean[] unused;
        for(int i=0;i<digits.length;i++)
        unused[i]=false;
        Hashset<Integer> result= solve(digits,s,unused);
        int[] array = set.stream().mapToInt(Integer::intValue).toArray();
        return array;

       
    }
    
    Hashset<Integer> solve(int[] digits, String current, int[] unused) {
        if(current.length()==3)
        {
            int number = Integer.parseInt(current); 
            if(num>=100 && num%2==0)
            {
                ans.Add(number); 
            }
            return;
        }

        for(int i=0;i<digits.length;i++)
        {
            if(unused[i]==true)
            continue;

            current=current+ digits[i];
            unused[i]= true;

            solve(current, unused);
            used[i]=false;
            current.substring()
        }

    }
}