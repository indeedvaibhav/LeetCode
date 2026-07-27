class Solution {
    public String addStrings(String num1, String num2) {
        int numA=0,numB=0;int x=0,y=0;
        for(int i=num1.length()-1;i>=0;i--)
        {
            int ch= num1.charAt(i)-'0';
            numA+=ch*Math.pow(10,x);x++;
        }
        for(int i=num2.length()-1;i>=0;i--)
        {
            int ch= num2.charAt(i)-'0';
            numB+=ch*Math.pow(10,y);y++;
        }
        return String.valueOf(numA+numB);
    }
}