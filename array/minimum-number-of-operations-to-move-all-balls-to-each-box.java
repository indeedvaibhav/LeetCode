class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        int count = 0 , operation= 0;

        for(int i =0 ; i<boxes.length();i++)
        {
            ans[i]  += operation;
            if(boxes.charAt(i)=='1')
                count++;
            
            operation += count;
        }

         count = 0 ; operation= 0;

        for(int i =boxes.length()-1 ; i>=0;i--)
        {
            ans[i]  += operation;
            if(boxes.charAt(i)=='1')
                count++;
            
            operation += count;
        }
        return ans;
    }
} 