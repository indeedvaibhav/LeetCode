class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int massgain = 0;
        boolean flag = false;
        Arrays.sort(asteroids);

        for (int i = 0; i < asteroids.length; i++)
        {
            if (mass >= asteroids[i]) {
                massgain = asteroids[i];
                mass += massgain;
                flag=true;
            } 
            else
            {flag=false;
            break;}
        }
        return flag;
    }
}