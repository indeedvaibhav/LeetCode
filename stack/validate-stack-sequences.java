class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
      
      int i=0,j=0;
        for(int x=0;i<=pushed.length-1;x++)
        {
            pushed[i]=pushed[x];
            while(pushed.length!=0 && j<popped.length && popped[i]==pushed[j])
            {
                i-=1;
                j+=1;
            }
            i+=1;
        }
        if(i==0)
            return true;
        else 
            return false;
            
        
    }
}