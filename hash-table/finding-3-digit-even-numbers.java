class Solution {
    HashSet<Integer> ans = new HashSet<>();
    boolean[] unused;
    public int[] findEvenNumbers(int[] digits) {
        String s = "";
        
        for (int i = 0; i < digits.length; i++)
            unused[i] = false;
        int[] result = solve(digits, s);    
        return result;

    }
 
    int[] solve(int[] digits, String current, int[] unused) {
        if(current.length()==3)
        {
            int number = Integer.parseInt(current); 
            if(number>=100 && number%2==0)
            {
                ans.add(number); 
            }
            return;
        }

        for(int i=0;i<digits.length;i++)
        {
            if(unused[i]==true)
            continue;

            current=current+ digits[i];
            unused[i]= true;

            solve(digits, current, unused);
            unused[i]=false;
            current.substring(current.length-1-i);
        }
        int[] array = new int[set.size()];
        int index = 0;
        for (Integer num : set) 
        {
            array[index++] = num; // Auto-unboxing handles conversion
        }
        return array;
    }
}