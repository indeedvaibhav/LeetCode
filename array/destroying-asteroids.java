class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int massgain = 0;
        boolean flag = false;
        Arrays.sort(asteroid);

        for (int i = 0; i < asteroids.length; i++)
        {
            if (mass >= asteroid[i]) {
                massgain = asteroid[i];
                mass += massgain;
                flag=true;
            } else
                break;
        }
        flag=false;
        return flag;
    }
}