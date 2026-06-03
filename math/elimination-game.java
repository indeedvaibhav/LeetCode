class Solution {
    public int lastRemaining(int n) {
        return solve(1, 1, n, true);
    }

    private int solve(int head, int step,
                      int remaining,
                      boolean left) {

        if (remaining == 1) {
            return head;
        }

        if (left || remaining % 2 == 1) {
            head += step;
        }

        return solve(
            head,
            step * 2,
            remaining / 2,
            !left
        );
    }
}