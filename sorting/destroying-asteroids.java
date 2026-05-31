class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int massgain=0;
        boolean flag=false;
        for(int i=0;i<asteroid.length;i++)
        {
            if(mass>=asteroid[i])
            {
                massgain=asteroid[i];
                mass+=massgain;
            }
            else
            break;
        }
        return flag;
    }
}