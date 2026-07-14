class Solution {
    public boolean backspaceCompare(String s, String t) {
               String res1=getResult(s);
        String res2=getResult(t);
    return res1.equals(res2);
    }
    public String getResult(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='#')
                sb.append(c);
            else if(sb.length()!=0)
                sb.deleteCharAt(sb.length()-1);
        }
    return sb.toString();

    }
}
