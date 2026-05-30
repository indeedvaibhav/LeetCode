import java.util.*;

class Solution {

    class SegmentTree {
        int[] tree;
        int n;

        SegmentTree(int n) {
            this.n = n;
            tree = new int[4 * n];
        }

        void update(int node, int start, int end, int idx, int val) {
            if (start == end) {
                tree[node] = val;
                return;
            }

            int mid = (start + end) / 2;

            if (idx <= mid)
                update(node * 2, start, mid, idx, val);
            else
                update(node * 2 + 1, mid + 1, end, idx, val);

            tree[node] = Math.max(tree[node * 2], tree[node * 2 + 1]);
        }

        int query(int node, int start, int end, int l, int r) {
            if (r < start || end < l)
                return 0;

            if (l <= start && end <= r)
                return tree[node];

            int mid = (start + end) / 2;

            return Math.max(
                query(node * 2, start, mid, l, r),
                query(node * 2 + 1, mid + 1, end, l, r)
            );
        }
    }

    public List<Boolean> getResults(int[][] queries) {

        TreeSet<Integer> coords = new TreeSet<>();
        coords.add(0);

        for (int[] q : queries) {
            coords.add(q[1]);
        }

        List<Integer> xs = new ArrayList<>(coords);
        Map<Integer, Integer> index = new HashMap<>();

        for (int i = 0; i < xs.size(); i++) {
            index.put(xs.get(i), i);
        }

        int n = xs.size();

        TreeSet<Integer> obstacles = new TreeSet<>();
        obstacles.add(0);

        SegmentTree st = new SegmentTree(n);

        for (int i = 1; i < n; i++) {
            st.update(1, 0, n - 1, i, xs.get(i) - xs.get(i - 1));
        }

        List<Boolean> ans = new ArrayList<>();

        for (int[] q : queries) {

            if (q[0] == 1) {

                int x = q[1];

                Integer left = obstacles.floor(x);
                Integer right = obstacles.ceiling(x);

                obstacles.add(x);

                int idx = index.get(x);

                st.update(
                    1,
                    0,
                    n - 1,
                    idx,
                    x - left
                );

                if (right != null) {
                    int ridx = index.get(right);

                    st.update(
                        1,
                        0,
                        n - 1,
                        ridx,
                        right - x
                    );
                }

            } else {

                int x = q[1];
                int sz = q[2];

                Integer prev = obstacles.floor(x);

                int pos = Collections.binarySearch(xs, x);

                if (pos < 0)
                    pos = -pos - 2;

                int maxGap = st.query(1, 0, n - 1, 0, pos);

                int tailGap = x - prev;

                ans.add(Math.max(maxGap, tailGap) >= sz);
            }
        }

        return ans;
    }
}