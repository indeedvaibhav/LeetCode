class Solution {
    public char kthCharacter(int k) {
        
        return operations("a",k);
    }
    static char operations(String current,int k)
    {
        if(current.length() >= k)
            return current.charAt(k - 1);

        String next = current + transform(current);

        return operations(next,k);
    }
    static String transform(String current)
    {
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < current.length(); i++) {
            char ch = current.charAt(i);

            if(ch == 'z')
                ans.append('a');
            else
                ans.append((char)(ch + 1));
        }

        return ans.toString();
    }


}