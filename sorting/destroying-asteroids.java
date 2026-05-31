class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int massgain=0;
        boolean flag=false;
        for(int i=0;i<asteroids.length;i++)
        {
            if(mass>=asteroids[i])
            {
                massgain=asteroids[i];
                mass+=massgain;
            }
            else
            break;
        }
        return flag;
    }
}