class Solution {
    public String addBinary(String a, String b) {
        int a1=0,a2=0;
        for(int i=0;i<a.length();i++)
            a1 += (int) (Math.pow(2, i) * (int) (a.charAt(a.length()-1-i) - '0'));
        for(int i=0;i<b.length();i++)
            a2 += (int) (Math.pow(2, i) * (int) (b.charAt(b.length()-1-i) - '0'));
        a1+=a2;
        StringBuilder sb=new StringBuilder();
        while(a1!=0)
        {
            int temp=a1%2;
            sb.append(temp);
            a1=a1/2;
        }
        return String.valueOf(sb.reverse());
    }
}