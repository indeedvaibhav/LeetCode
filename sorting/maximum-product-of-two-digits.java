class Solution {
    public int maxProduct(int n) {
        String s= String.valueOf(n);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            int ch1= s.charAt(i)- '0';
            for(int j=i+1;j<s.length();j++)
            {
                int ch2= s.charAt(j)- '0';
                max= Math.max(max,ch1*ch2);
            }
        }
        return max;
        
    }
}