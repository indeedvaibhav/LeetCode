class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
      
        Stack<Integer> stack= new Stack<>();
        int x=0;
        for(int i=0;i<=pushed.length-1;i++)
        {
            stack.push(pushed[i]);
            while(!stack.isEmpty() && stack.peek()==popped[x])
            {
                stack.pop();
                    x++;
            }

        }
        if(stack.isEmpty())
            return true;
        return false;

        
    }
}