class Solution {
    public String processStr(String s) {
         StringBuilder result=new StringBuilder();
        for(int i=0;i<=s.length()-1;i++)
        {
            char ch= s.charAt(i);
            if(Character.isLowerCase(ch))
                result.append(ch);
            else if(ch=='*')
                result.deleteCharAt(result.length() - 1);
            else if(ch=='#') {
                String x = String.valueOf(result);
                result.append(x);
            }
            else if(ch=='%')
                result.reverse();
        }
        return result.toString();
    }
}
