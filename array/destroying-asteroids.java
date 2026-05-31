class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int massgain = 0;
        boolean flag = false;
        ArrayList<Integer> aster = Arrays.stream(asteroids)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        Arrays.sort(asteroids);

        for (int i = 0; i < aster.size(); i++)
        {
            if (mass >= aster.get(i)) {
                massgain = aster.get(i);
                mass += massgain;
            } else
                break;
        }
        return flag;
    }
}