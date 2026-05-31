class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int massgain = 0;
        long currentmass=mass;
        
        boolean flag = false;
        Arrays.sort(asteroids);

        for (int i = 0; i < asteroids.length; i++)
        {
            if (currentmass >= asteroids[i]) {
                massgain = asteroids[i];
                currentmass += massgain;
                flag=true;
            } 
            else
            {flag=false;
            break;}
        }
        return flag;
    }
}