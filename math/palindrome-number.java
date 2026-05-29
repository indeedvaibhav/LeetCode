class Solution {
    public boolean isPalindrome(int x) {
       int sum=0;String str="";
        String s=String.valueOf(x);
        int temp=x;
        if(x==0)
        return true;
        if(temp>0) {
            while (temp!= 0) {
                int n = temp % 10;
                sum = sum * 10 + n;
                temp= temp/ 10;
            }
            str = String.valueOf(sum);
        }
        else
        {
            while (Math.abs(temp) != 0) {
                int n = temp % 10;
                sum = sum * 10 + n;
                temp = temp/ 10;
            }
            str=sum+"-";
        }

        if(str.equals(s))
            return true;
        else
            return false;
        
    }
}