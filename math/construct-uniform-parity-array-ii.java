class Solution {
    public boolean uniformArray(int[] nums1) {
        
        boolean check = checkTrue(nums1);
        if(check) return true;
        boolean checkFalse= checkOdd(nums1);
        if(checkFalse) return true;
        int count=0;
        for(int i = 0 ; i< nums1.length;i++){

            if(nums1[i]%2!=0) 
                count++;
            else{
                for(int j =0 ;j<nums1.length;j++){
                    if(j!=i && (nums1[i]-nums1[j])>=1)
                    {
                        if((nums1[i]-nums1[j])%2!=0) count++;
                    }
                }
            }
        }
        if(count==nums1.length) return true;
        return false;
        
    }
    public boolean checkTrue(int[] nums1){
        int count=0;

        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]%2==0) 
                count++;
        }
        if(count==nums1.length) return true;

        return false;
    }
    public boolean checkOdd(int[] nums1){
        int count=0;

        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]%2!=0) 
                count++;
        }
        if(count==nums1.length) return true;

        return false;
    }
}









