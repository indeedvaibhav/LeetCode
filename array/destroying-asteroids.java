class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int massgain = 0;
        Long Mass=mass;
        boolean flag = false;
        Arrays.sort(asteroids);

        for (int i = 0; i < asteroids.length; i++)
        {
            if (Mass >= asteroids[i]) {
                massgain = asteroids[i];
                Mass += massgain;
                flag=true;
            } 
            else
            {flag=false;
            break;}
        }
        return flag;
    }
}