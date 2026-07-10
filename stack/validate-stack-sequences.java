class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
       Stack<Integer> stack= new Stack<>();
        int x=0;
        for(int i=0;i<pushed.length;i++)

        {
            stack.push(pushed[i]);
            if(stack.peek()==popped[x])
            {
                stack.pop();x++;
            }

        }

        for(;x<popped.length;x++)
        {
            if(stack.peek()==popped[x])
                stack.pop();
        }
        if(stack.isEmpty())
            return true;
        else
            return false;

        
    }
}