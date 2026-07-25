class Solution {
    public int addDigits(int num) {
        String temp=String.valueOf(num);
        while(temp.length()!=1)
        {
            temp=reduce(Integer.parseInt(temp));
        }
        return Integer.parseInt(temp);
        
    }
    static String reduce(int num)
    {
        int sum=0;
        while(num!=0)
        {
            int x=num%10;
            sum+=x;
            num=num/10;
        }
        return String.valueOf(sum);
    }
}