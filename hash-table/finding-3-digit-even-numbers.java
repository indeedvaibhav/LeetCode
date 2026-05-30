class Solution {
    HashSet<Integer> ans = new HashSet<>();

    public int[] findEvenNumbers(int[] digits) {
        String s = "";
        boolean[] unused;
        for (int i = 0; i < digits.length; i++)
            unused[i] = false;
        int[] result = solve(digits, s, unused);
        return result;

    }

    int[] solve(int[] digits, String current, int[] unused) {
        if(current.length()==3)
        {
            int number = Integer.parseInt(current); 
            if(number>=100 && number%2==0)
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
            unused[i]=false;
            current.substring(current.length-1-i);
        }
        int[] array = new int[set.size()];
int index = 0;
for (Integer num : set) {
    array[index++] = num; // Auto-unboxing handles conversion
}

    }
}