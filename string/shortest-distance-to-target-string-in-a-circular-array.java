class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;

        for(int dist=0; dist<n; dist++)
        {
            int left = (startIndex - dist + n) % n;
            int right = (startIndex + dist) % n;

            if(words[left].equals(target) || words[right].equals(target))
                return dist;
        }

        return -1;
    }
}