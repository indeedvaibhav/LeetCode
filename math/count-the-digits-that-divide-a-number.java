class Solution {
    public int countDigits(int num) {
        int digits= 0; 
        int x = num;
        while(x!=0){
            int y= x%10;
            if(num%y==0)
                digits++;
            x=x/10; 
        }
        
        return digits;
  
    }
}