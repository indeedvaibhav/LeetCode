class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(ch=='#')
            {
                if(!stack.isEmpty())
                stack.pop();
            }
            else
            stack.push(ch);
        }
        String str1=stack.toString();

        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<t.length();i++)
        {
            char ch= t.charAt(i);
            if(ch=='#')
            {
                stack2.pop();
            }
            else
            stack2.push(ch);
        }
        String str2=stack2.toString();

        return str1.equals(str2); 
    }
}
